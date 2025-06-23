package io.cavia.homenet.repository;

import io.cavia.homenet.domain.Trades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TradesDefaultRepository extends JpaRepository<Trades, Long> {

    List<Trades> findByStockId(int stockId);

    void deleteAllByStockId(Integer stockId);

    List<Trades> findAllByStockIdOrderByIdAsc(Integer stockId);

    @Query("SELECT COALESCE(MAX(q.id), 0) FROM Quotes q")
    long findMaxId();
    @Modifying
    @Transactional
    @Query(value = "ALTER TABLE Quotes AUTO_INCREMENT = ?1", nativeQuery = true)
    void resetAutoIncrement(long nextId);
}
