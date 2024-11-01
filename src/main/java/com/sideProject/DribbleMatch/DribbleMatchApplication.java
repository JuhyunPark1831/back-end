package com.sideProject.DribbleMatch;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DribbleMatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(DribbleMatchApplication.class, args);
	}

}
