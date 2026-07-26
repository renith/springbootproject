package com.example.asyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@SpringBootApplication
@EnableAsync
public class AsynApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsynApplication.class, args);
	}

	@Bean(name = "customExecutor")
	public Executor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();

		executor.setCorePoolSize(2);        // Minimum threads
		executor.setMaxPoolSize(5);         // Maximum threads
		executor.setQueueCapacity(100);     // Queue size
		executor.setThreadNamePrefix("Async-Worker-"); // Thread name
		executor.setKeepAliveSeconds(60);   // Thread idle time before termination

		executor.initialize();
		return executor;
	}

}
