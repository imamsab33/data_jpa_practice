package com.imamsab.entity;

import javax.sql.DataSource;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
 basePackages = "com.example.secondary.repository",
 entityManagerFactoryRef = "secondaryEntityManagerFactory",
 transactionManagerRef = "secondaryTransactionManager"
)
public class secondaryDataSourceConfig {

 @Primary
 @Bean(name = "secondaryDataSource")
 @ConfigurationProperties(prefix = "spring.datasource.primary")
 public DataSource dataSource() {
     return DataSourceBuilder.create().build();
 }

 @Primary
 @Bean(name = "secondaryEntityManagerFactory")
 public LocalContainerEntityManagerFactoryBean entityManagerFactory(
         EntityManagerFactoryBuilder builder,
         @Qualifier("secondaryDataSource") DataSource dataSource) {
     return builder
             .DataSource(dataSource)
             .packages("com.example.secondary.model")
             .persistenceUnit("primary")
             .build();
 }

 @Primary
 @Bean(name = "secondaryTransactionManager")
 public PlatformTransactionManager transactionManager(
         @Qualifier("secondaryEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
     return new JpaTransactionManager(entityManagerFactory);
 }
}



