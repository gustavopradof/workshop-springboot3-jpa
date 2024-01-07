package com.gustavopradof.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavopradof.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
