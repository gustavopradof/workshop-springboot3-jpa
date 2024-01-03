package com.gustavopradof.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavopradof.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
