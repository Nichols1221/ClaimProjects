package com.realtor.SallysHomes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.realtor")
public class SallysHomesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SallysHomesApplication.class, args);
	}

}
