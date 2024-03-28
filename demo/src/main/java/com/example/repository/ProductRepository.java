package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.model.Product;

@Repository("productRepository")
public interface ProductRepository  extends JpaRepository<Product, Integer>{

	@Query(value = "SELECT * FROM Product", nativeQuery = true)
	List<Product> get();

}
