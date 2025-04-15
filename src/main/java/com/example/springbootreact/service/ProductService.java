package com.example.springbootreact.service;

import com.example.springbootreact.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface ProductService {

    List<Product> getAllProducts();
    Optional<Product> getProductById(Long id);
    Product saveProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long id);
}
