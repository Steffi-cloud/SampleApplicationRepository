package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.retry.annotation.EnableRetry;
@EnableRetry
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringBootRetryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRetryApplication.class, args);
	}

}
