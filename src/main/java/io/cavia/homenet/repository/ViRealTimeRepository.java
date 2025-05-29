package io.cavia.homenet.repository;

import io.cavia.homenet.domain.ViRealTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViRealTimeRepository extends JpaRepository<ViRealTime, Long> {
}
