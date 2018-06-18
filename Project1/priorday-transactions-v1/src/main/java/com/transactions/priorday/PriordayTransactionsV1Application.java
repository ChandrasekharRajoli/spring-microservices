package com.transactions.priorday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PriordayTransactionsV1Application {

	public static void main(String[] args) {
		SpringApplication.run(PriordayTransactionsV1Application.class, args);
	}
}
