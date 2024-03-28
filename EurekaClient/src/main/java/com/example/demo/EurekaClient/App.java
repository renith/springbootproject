package com.example.demo.EurekaClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.controller","com.example.service"})
@EnableDiscoveryClient
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		SpringApplication.run(App.class, args);
	
    }
    @Bean
	public RestTemplate restTamplate() {
		
		return new RestTemplate();
	}
}
