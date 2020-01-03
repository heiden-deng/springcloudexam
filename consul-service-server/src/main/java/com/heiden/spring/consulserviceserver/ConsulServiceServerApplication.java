package com.heiden.spring.consulserviceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsulServiceServerApplication.class, args);
	}
}
