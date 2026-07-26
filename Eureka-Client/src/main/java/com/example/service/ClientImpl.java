package com.example.service;

import java.util.Arrays;

import com.example.model.Product;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClientImpl implements ClientInterface{
	
	@Autowired
	private RestTemplate restTamplate;

	@HystrixCommand(fallbackMethod = "fallback_hello", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
	})
	public Product[] get() throws InterruptedException {
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(header);
		ResponseEntity<Product[]> response = restTamplate.getForEntity("http://localhost:8086/app/get", Product[].class);
		Product[] product = response.getBody();
		//Thread.sleep(3000);
			return product;
		
	}

	@Override
	public String getData(int price) {
		String url = "http://DemoJPA/payment-provider/payNow/" + price;
		return restTamplate.getForObject(url, String.class);
	}

	private String fallback_hello() {
		return "Request fails. It takes long time to response";
	}

}
