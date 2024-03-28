package com.example.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.model.Product;

@Service
public class ClientImpl implements ClientInterface{
	
	@Autowired
	private RestTemplate restTamplate;

	public Product[] get() {
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(header);
		ResponseEntity<Product[]> response = restTamplate.getForEntity("http://localhost:8086/app/get", Product[].class);
		Product[] product = response.getBody();
			
			
			return product;
		
	}
}
