package io.cavia.homenet.repository;

import io.cavia.homenet.domain.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface QuotesDefaultRepository extends JpaRepository<Quotes, Long> {

    List<Quotes> findByStockId(int stockId);
    void deleteAllByStockId(Integer stockId);
    List<Quotes> findAllByStockIdOrderByIdAsc(Integer stockId);
    @Query("SELECT COALESCE(MAX(q.id), 0) FROM Quotes q")
    long findMaxId();
    @Modifying
    @Transactional
    @Query(value = "ALTER TABLE Quotes AUTO_INCREMENT = ?1", nativeQuery = true)
    void resetAutoIncrement(long nextId);
}
