package io.cavia.homenet.repository;

import io.cavia.homenet.domain.Stock;
import io.cavia.homenet.domain.VStock;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface VStockDefaltRepository extends JpaRepository<VStock, Long> {
    List<VStock> findAllByOrderByCreatedAtDesc(Pageable pageable);
}
