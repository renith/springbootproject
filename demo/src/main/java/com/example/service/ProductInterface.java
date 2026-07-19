package com.example.service;

import java.util.List;

import com.example.model.Product;

public interface ProductInterface {

	List<Product> get();

	Product save(Product product);

}
