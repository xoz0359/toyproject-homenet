package io.cavia.homenet.repository;

import io.cavia.homenet.domain.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QotesDefaltRepository extends JpaRepository<Quotes, Long> {

    List<Quotes> findByStockId(Long stockId);
}
