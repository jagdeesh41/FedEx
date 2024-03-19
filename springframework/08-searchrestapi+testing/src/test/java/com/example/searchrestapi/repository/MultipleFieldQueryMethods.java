package com.example.searchrestapi.repository;


import com.example.searchrestapi.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MultipleFieldQueryMethods
{
    @Autowired
    ProductRepository productRepository;

    @Test
    void method1()
    {
        Product product=productRepository.findByNameAndSku("pen","100AED");

        System.out.println(product);


    }
    @Test
    void method2()
    {
        Product product=productRepository.findByNameAndSkuAndActive("pen","100AED",true);

        System.out.println(product);


    }

    @Test
    void method3()
    {
        List<Product> products=productRepository.findByNameOrSku("pen","100AED");

        System.out.println(products);


    }

    @Test
    void method4()
    {
        Product product=productRepository.findDistinctByName("pen");
        System.out.println(product);


    }








}
