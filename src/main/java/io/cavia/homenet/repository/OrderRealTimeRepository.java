package io.cavia.homenet.repository;

import io.cavia.homenet.domain.OrderRealTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRealTimeRepository extends JpaRepository<OrderRealTime, Long> {
}
