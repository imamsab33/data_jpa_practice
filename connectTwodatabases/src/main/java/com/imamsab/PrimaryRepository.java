package com.imamsab;

import org.springframework.data.jpa.repository.JpaRepository;
import com.imamsab.entity.PrimaryDataSourceConfig;



public interface PrimaryRepository extends JpaRepository<PrimaryDataSourceConfig, Long> {

}
