package com.Customerorder.Customerorder.repository;

import com.Customerorder.Customerorder.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> { }
