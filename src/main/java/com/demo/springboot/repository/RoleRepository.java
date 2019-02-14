package com.demo.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.springboot.model.Role;

public interface RoleRepository extends CrudRepository<Role, Integer>{
}