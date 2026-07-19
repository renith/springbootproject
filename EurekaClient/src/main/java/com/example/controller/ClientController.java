package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ClientInterface;

@RestController
public class ClientController {

	
	@Autowired
	private ClientInterface clientInterface;
	
	@GetMapping("/GetDoctor")
	public Product[] get() {
		return clientInterface.get();
	}
	
	
}
