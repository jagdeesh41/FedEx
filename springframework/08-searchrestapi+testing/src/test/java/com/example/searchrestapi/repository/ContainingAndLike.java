package com.example.searchrestapi.repository;


import com.example.searchrestapi.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ContainingAndLike {

    @Autowired
    ProductRepository productRepository;


    @Test
    public void method1()
    {
        List<Product> products=productRepository.findAllByNameContaining("pen");
        products.stream().forEach(System.out::println);
    }

    @Test
    public void method2()
    {
        List<Product> products=productRepository.findAllByNameLike("pen");
        products.stream().forEach(System.out::println);
    }
}
