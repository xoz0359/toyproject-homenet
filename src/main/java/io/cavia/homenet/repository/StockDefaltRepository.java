package io.cavia.homenet.repository;

import io.cavia.homenet.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDefaltRepository extends JpaRepository<Stock, String> {
}
