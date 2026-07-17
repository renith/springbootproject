package com.example.service;

import java.util.List;

import com.example.Entity.Product;

public interface ProductInterface {

	List<Product> get();

	Product save(Product product);

}
