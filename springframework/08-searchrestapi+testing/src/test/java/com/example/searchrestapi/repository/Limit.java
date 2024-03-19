package com.example.searchrestapi.repository;

import com.example.searchrestapi.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
public class Limit
{

    @Autowired
    private ProductRepository productRepository;


    @Test
    public void method()
    {
        List<Product> products=productRepository.findFirst3ByPriceBetween(5,10);

        products.stream().forEach(System.out::println);


    }





}
