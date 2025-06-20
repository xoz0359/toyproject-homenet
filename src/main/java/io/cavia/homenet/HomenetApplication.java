package io.cavia.homenet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HomenetApplication {
	public static void main(String[] args) {
		SpringApplication.run(HomenetApplication.class, args);
	}

}
