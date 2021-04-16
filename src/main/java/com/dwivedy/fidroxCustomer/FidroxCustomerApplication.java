package com.dwivedy.fidroxCustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan("com.dwivedy")
@EntityScan("com.dwivedy.firdoxCustomer.entity")
@EnableJpaRepositories(basePackages = {"com.dwivedy.firdoxCustomer.service"})
public class FidroxCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FidroxCustomerApplication.class, args);
	}

}
