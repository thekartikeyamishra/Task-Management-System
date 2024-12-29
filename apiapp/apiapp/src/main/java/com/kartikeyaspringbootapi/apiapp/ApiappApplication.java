package com.kartikeyaspringbootapi.apiapp;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableScheduling
public class ApiappApplication {
		public static void main(String[] args) {
			SpringApplication.run(ApiappApplication.class, args);
		}
	}
	