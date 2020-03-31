package com.lma.flad.access;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EntityScan(basePackages = {"com.lma.flad" })
@ComponentScan(basePackages = {"com.lma.flad.bvo","com.lma.flad.repository",
        "com.lma.flad.controller",
        "com.lma.flad.service",
        "com.lma.flad.service.impl"})
@EnableJpaRepositories(basePackages = {"com.lma.flad.repository"})

public class FladApplication {
    public static void main(String[] args) {
        SpringApplication.run(FladApplication.class, args);
    }
}
