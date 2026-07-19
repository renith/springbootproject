package com.example.LoadBalancedMainApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableDiscoveryClient
@RibbonClient(name = "demo", configuration = RibbonConfiguration.class)
public class LoadBalancedMainAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancedMainAppApplication.class, args);
	}

	@LoadBalanced
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
