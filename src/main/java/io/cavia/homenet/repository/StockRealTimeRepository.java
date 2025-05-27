package io.cavia.homenet.repository;

import io.cavia.homenet.domain.StockRealTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface StockRealTimeRepository extends JpaRepository<StockRealTime, Long> {
}
