package com.gamezone.gamezone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.gamezone.repository")
@ComponentScan(basePackages = "com.gamezone.*")
@EntityScan(basePackages = "com.gamezone.entity")
public class GamezoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamezoneApplication.class, args);
	}
}
