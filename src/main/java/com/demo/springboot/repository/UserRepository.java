package com.demo.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.springboot.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{
    User findByUsername(String username);
}
