package com.example.searchrestapi.service;

import com.example.searchrestapi.entity.Product;

import java.util.List;
public interface ProductService
{
    List<Product> searchProducts(String query);


    Product createProduct(Product product);

    List<Product> createProduct();

    void updateProduct(Product product, long id);
}
