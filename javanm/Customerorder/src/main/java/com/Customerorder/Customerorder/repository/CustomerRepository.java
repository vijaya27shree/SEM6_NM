package com.Customerorder.Customerorder.repository;



import com.Customerorder.Customerorder.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }
