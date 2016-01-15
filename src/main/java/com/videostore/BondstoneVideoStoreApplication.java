package com.videostore;

import com.videostore.Repositories.ActorRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableAutoConfiguration
@SpringBootApplication
public class BondstoneVideoStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BondstoneVideoStoreApplication.class, args);
	}
}
