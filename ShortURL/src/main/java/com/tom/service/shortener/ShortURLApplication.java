package com.tom.service.shortener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class ShortURLApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShortURLApplication.class, args);
	}

}
