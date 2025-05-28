package io.cavia.homenet.repository;

import io.cavia.homenet.domain.OrderRealTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRealTimeRepository extends JpaRepository<OrderRealTime, Long> {
    List<OrderRealTime> findByMkscShrnIscd(String mkscShrnIscd);
}
