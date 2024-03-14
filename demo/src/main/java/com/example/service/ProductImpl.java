package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Product;
import com.example.repository.ProductRepository;

@Service
@Transactional
public class ProductImpl implements ProductInterface {
	
	@Autowired
	private ProductRepository productRepository;

	
	public List<Product> get() {
		// TODO Auto-generated method stub
		return productRepository.get();
	}


	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

}
