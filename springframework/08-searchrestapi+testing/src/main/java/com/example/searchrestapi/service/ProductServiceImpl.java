package com.example.searchrestapi.service;

import com.example.searchrestapi.entity.Product;
import com.example.searchrestapi.repository.ProductRepository;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService
{
    private ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query)
    {
        return this.productRepository.searchProducts(query);

    }
    @Override
    public Product createProduct(Product product)
    {
        System.out.println("im service");
        return this.productRepository.save(product);

    }
    @Override
    public List<Product> createProduct() {
        return this.productRepository.findAll();
    }

    @Override
    public void updateProduct(Product product, long id)
    {
        Optional<Product> product1=this.productRepository.findById((id));

        product1.get().setName(product.getName());





    }

}
