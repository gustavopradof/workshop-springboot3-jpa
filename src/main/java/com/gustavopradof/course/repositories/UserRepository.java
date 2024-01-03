package com.gustavopradof.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavopradof.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
