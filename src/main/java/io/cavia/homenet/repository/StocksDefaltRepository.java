package io.cavia.homenet.repository;

import io.cavia.homenet.domain.Stocks;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
public interface StocksDefaltRepository extends JpaRepository<Stocks, Integer> {
    List<Stocks> findAllByOrderByIdDesc(Pageable pageable);
    List<Stocks> findAllByOrderByIdAsc();
    @Query("SELECT COALESCE(MAX(q.id), 0) FROM Quotes q")
    long findMaxId();
    @Modifying
    @Transactional
    @Query(value = "ALTER TABLE Quotes AUTO_INCREMENT = ?1", nativeQuery = true)
    void resetAutoIncrement(long nextId);
}
