package com.gustavopradof.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavopradof.course.entities.Product;
import com.gustavopradof.course.entities.User;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
