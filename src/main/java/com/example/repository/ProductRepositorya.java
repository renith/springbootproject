package com.example.repository;

import com.example.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("productRepository")
public interface ProductRepositorya extends JpaRepository<Product, Integer> {

	@Query(value = "SELECT * FROM Product", nativeQuery = true)
	List<Product> get();

}
