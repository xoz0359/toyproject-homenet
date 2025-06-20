package io.cavia.homenet.repository;

import io.cavia.homenet.domain.Stocks;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface StocksDefaltRepository extends JpaRepository<Stocks, Long> {
    List<Stocks> findAllByOrderByCreatedAtDesc(Pageable pageable);
}
