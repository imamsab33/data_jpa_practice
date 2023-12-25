package com.imamsab;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imamsab.entity.secondaryDataSourceConfig;

public interface SecondaryRepository extends JpaRepository<secondaryDataSourceConfig, Long> {

}
