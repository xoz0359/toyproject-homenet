package io.cavia.homenet.repository;

import io.cavia.homenet.domain.OrderRealTime;
import io.cavia.homenet.domain.StockRealTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface StockRealTimeRepository extends JpaRepository<StockRealTime, Long> {
    List<StockRealTime> findByMkscShrnIscd(String mkscShrnIscd);
}
