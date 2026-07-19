package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Product;
import com.example.service.ProductInterface;

@RestController
@RequestMapping("/app")
public class AppController {
	
	@Autowired
	private ProductInterface productInterface;
	
	@GetMapping("/get")
		public List<Product> get() {
			return productInterface.get();
			
		}
	
	@PostMapping("/create")
	public Product create(@RequestBody Product product) {
		
		
		return productInterface.save(product);
		
	}
	}


