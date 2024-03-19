package com.example.searchrestapi.repository;
import com.example.searchrestapi.entity.Product;
import com.example.searchrestapi.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.Query;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@SpringBootTest
public class QueryMethodsTest
{

    private ProductRepository productRepository;


    @Autowired
    public QueryMethodsTest(ProductRepository productRepository)
    {
        this.productRepository=productRepository;

    }


    @Test
    void findByNameMethod()
    {
        Product product=productRepository.findByName("sdaskdskdasdsak");
        System.out.println(product);
//


    }

    @Test
    void findAllByActiveMethod()
    {
        List<Product>products=productRepository.findAllByActive(true);
        System.out.println(products);

    }

    @Test
    void findAllByIdMethod()
    {
        List<Long>arr=new ArrayList<>(List.of(1l,2l,3l));
        List<Product> products=productRepository.findAllById(arr);
        System.out.println(products);

    }


    @Test
    void findByDescriptinMerthod()
    {
        List<Product> products=productRepository.findAllByDescription("im runner");
        products.forEach(e-> System.out.println(e));

    }

    @Test
    void farroqTesting()
    {
        List<Product> products=productRepository.findAllByName("Adidas");
        System.out.println(products);
    }
    @Test
    void farroqTestingMethod()
    {
        List<Product> products=productRepository.findAllByName("Adidas");
        System.out.println(products);
    }










}
