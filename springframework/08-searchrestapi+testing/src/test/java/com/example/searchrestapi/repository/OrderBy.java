package com.example.searchrestapi.repository;


import com.example.searchrestapi.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
public class OrderBy{

    @Autowired
    private ProductRepository productRepository;




    @Test
    public void method1()
    {
        List<Product> products=productRepository.findFirst3ByOrderByPriceAsc();
        products.stream().forEach(System.out::println);



    }
    @Test
    public void method2()
    {
        List<Product> products=productRepository.findFirst3ByOrderByPriceDesc();
        products.stream().forEach(System.out::println);



    }
    @Test
    public void method3()
    {
        List<Product> products=productRepository.findTop3ByOrderByPriceDesc();
        products.stream().forEach(System.out::println);



    }


}
