package com.realtor.Config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableJpaRepositories(basePackages="com.realtor.Repo")
@EntityScan(basePackages="com.realtor.Entity")
public class ApplicationConfig {

}