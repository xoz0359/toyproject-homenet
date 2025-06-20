package io.cavia.homenet.repository;

import io.cavia.homenet.domain.Trades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TradesDefaltRepository extends JpaRepository<Trades, Long> {

    List<Trades> findByStockId(int stockId);
    void deleteByStockId(int stockId);
}
