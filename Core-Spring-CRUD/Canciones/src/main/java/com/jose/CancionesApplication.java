package com.jose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.jose")
@EnableJpaRepositories("com.jose.repositorios") 
@EntityScan("com.jose.modelos")
public class CancionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CancionesApplication.class, args);
	}

}
