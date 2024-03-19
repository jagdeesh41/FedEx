package com.example.searchrestapi.repository;


import com.example.searchrestapi.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GreaterThanLessThan {

    @Autowired
    ProductRepository productRepository;

    @Test
    public void method1()
    {
        List<Product> productList=productRepository.findByPriceGreaterThan(9);
        productList.stream().forEach(System.out::println);
        productList.stream().forEach(e-> System.out.println(e.getName()));


    }

    @Test
    public void method2()
    {
        List<Product> productList=productRepository.findByPriceLessThan(10);
        productList.stream().forEach(System.out::println);
        productList.stream().forEach(e-> System.out.println(e.getName()));


    }
}
