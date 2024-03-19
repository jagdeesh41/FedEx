package com.example.searchrestapi.repository;


import com.example.searchrestapi.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class Between {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void method1()
    {
        List<Product> products=productRepository.findAllByPriceBetween(5,10);
        products.stream().forEach(System.out::println);
    }
    @Test
    public void method2()
    {
        LocalDateTime startDate=LocalDateTime.of(2024,3,6,17,53,5);
        LocalDateTime endDate=LocalDateTime.of(2024,3,6,19,14,58);
        List<Product> products=productRepository.findAllByDateCreatedBetween(startDate,endDate);
        products.stream().forEach(System.out::println);
    }




}
