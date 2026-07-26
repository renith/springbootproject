package com.example.controller;

import com.example.model.Product;
import com.example.service.ClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientController {


	@Autowired
	private ClientInterface clientInterface;

	@GetMapping("/getDoctor")
	public Product[] get() throws InterruptedException {

		return clientInterface.get();
	}


	@GetMapping("/demo/{price}")
	public String invokePaymentService(@PathVariable int price) {
		return  clientInterface.getData(price);
	}
	
}
