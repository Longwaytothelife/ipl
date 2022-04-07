package com.ipl.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.controller","com.model"})
@EnableJpaRepositories({"com.model"})
@EntityScan("com.model")
public class Iplfatancy2Application {

	public static void main(String[] args) {
		SpringApplication.run(Iplfatancy2Application.class, args);
	}

}
