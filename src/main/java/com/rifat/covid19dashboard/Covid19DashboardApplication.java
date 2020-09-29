package com.rifat.covid19dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Covid19DashboardApplication {

	public static void main(String[] args) {

		SpringApplication.run(Covid19DashboardApplication.class, args);

	}

}