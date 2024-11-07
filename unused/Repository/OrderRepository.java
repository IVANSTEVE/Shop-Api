package com.shop.backend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unused.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    
}