package com.nutrition.nutritionPlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NutritionPlanApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutritionPlanApplication.class, args);
	}

}
