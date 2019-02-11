package com.demo.springboot.services;

import com.demo.springboot.model.Product;

public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

	void deleteProduct(Integer id);
}
