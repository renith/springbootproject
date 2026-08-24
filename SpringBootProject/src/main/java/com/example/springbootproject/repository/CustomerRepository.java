package com.example.springbootproject.repository;

import com.example.springbootproject.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

    @Query(value = "SELECT * FROM customers c WHERE c.customer_id = :id AND c.city = :city",
            nativeQuery = true)
    List<Customer> get(@Param("id") Long id,
                       @Param("city") String city);


}
