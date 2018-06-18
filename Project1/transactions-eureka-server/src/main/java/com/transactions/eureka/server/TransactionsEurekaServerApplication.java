package com.transactions.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TransactionsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionsEurekaServerApplication.class, args);
	}
}
