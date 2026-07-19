package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.example.config.JpaConfig;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.controller","com.example.service"})
@Import(JpaConfig.class)
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("dxfdfsg");
		SpringApplication.run(DemoApplication.class, args);
	}

}
