package com.demo.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import com.demo.springboot.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
}