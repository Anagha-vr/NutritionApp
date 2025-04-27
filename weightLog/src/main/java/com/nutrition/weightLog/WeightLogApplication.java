package com.nutrition.weightLog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WeightLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeightLogApplication.class, args);
	}

}
