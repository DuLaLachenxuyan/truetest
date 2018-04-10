package com.learning.prod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class ProdServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdServerApplication.class, args);
	}

	@Bean
	// 通过该注解开启均衡负载能力
	@LoadBalanced
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
