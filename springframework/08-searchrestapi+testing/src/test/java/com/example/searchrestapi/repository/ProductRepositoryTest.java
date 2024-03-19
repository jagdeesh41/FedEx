package com.example.searchrestapi.repository;



import com.example.searchrestapi.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductRepositoryTest
{
    @Autowired
    private ProductRepository productRepository;


    @Test
    public void saveMethod()
    {
        Product product =new Product();
        product.setName("Prod 1");
        product.setDescription("asdasdasdsa");
        product.setActive(true);
        product.setImageUrl("assdsds");
        product.setSku("sdsdsds");

        Product savedObject=productRepository.save(product);

        System.out.println(savedObject);
    }

    @Test
    public void updateUsingSaveMethod()
    {
        Long id=2L;
        Product product=productRepository.findById(id).get();

        product.setName("Adidas");
        product.setDescription("im runner");

        productRepository.save(product);
    }


    @Test
    public void deleteMethod()
    {
        Long id=3L;
        Product product=productRepository.findById(id).get();

        productRepository.delete(product);


    }


    @Test
    public void findByIdMethod()
    {
        long id=1L;
        Product product=productRepository.findById(id).get();


    }

    @Test
    public void saveAllMethod()
    {
        Product product1 =new Product();
        product1.setName("drawer");
        product1.setDescription("draw it");
        product1.setActive(true);
        product1.setImageUrl("draw.jpg");
        product1.setSku("100AED");
        product1.setPrice(7);

        Product product2 =new Product();
        product2.setName("Box");
        product2.setDescription("Wrap em all");
        product2.setActive(false);
        product2.setImageUrl("box.jpg");
        product2.setSku("150AED");
        product2.setPrice(8);


        productRepository.saveAll(List.of(product1,product2));
    }

    @Test
    public void findALlMethod()
    {
        List<Product> products=productRepository.findAll();
        products.forEach(e-> System.out.println(e));
    }

    @Test
    public void finddeleteMethod()
    {
        //find entitiy by id

        List<Product> products=productRepository.findAll().stream().filter(e->e.getName().contains("rod")).collect(Collectors.toList());

        products.forEach(e->productRepository.delete(e));





    }

    @Test
    public void deleteAllIterableMethod()
    {
        List<Product> products=this.productRepository.findAll().stream().filter(e->e.getDescription().toLowerCase().contains("ee")).collect(Collectors.toList());
        System.out.println(products);
        productRepository.deleteAll(products);



    }
    @Test
    public void deleteAllMethod()
    {
        this.productRepository.deleteAll();
    }


    @Test
    public void countMethod()
    {
        System.out.println(this.productRepository.count());

    }

    @Test
    public void existByIdMethod()
    {
        System.out.println(this.productRepository.existsById(1L));

    }



  
}