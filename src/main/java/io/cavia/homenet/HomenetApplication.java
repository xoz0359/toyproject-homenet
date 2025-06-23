package io.cavia.homenet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaAuditing
@SpringBootApplication
@EnableScheduling
public class HomenetApplication {
	public static void main(String[] args) {
		SpringApplication.run(HomenetApplication.class, args);
	}

}
