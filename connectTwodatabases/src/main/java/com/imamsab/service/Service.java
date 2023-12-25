package com.imamsab.service;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.imamsab.PrimaryRepository;
import com.imamsab.SecondaryRepository;
import com.imamsab.entity.PrimaryDataSourceConfig;
import com.imamsab.entity.secondaryDataSourceConfig;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    private PrimaryRepository primaryRepository;

    @Autowired
    private SecondaryRepository secondaryRepository;

    // Use repositories as needed
    public void performDatabaseOperations() {
        // Example: Save entities
    	PrimaryDataSourceConfig primaryEntity = new PrimaryDataSourceConfig();
        primaryRepository.save(primaryEntity);

        secondaryDataSourceConfig secondaryEntity = new secondaryDataSourceConfig();
        secondaryRepository.save(secondaryEntity);
 java.util.List<PrimaryDataSourceConfig> list = primaryRepository.findAll();
java.util.List<secondaryDataSourceConfig> all = secondaryRepository.findAll();
    }
}


