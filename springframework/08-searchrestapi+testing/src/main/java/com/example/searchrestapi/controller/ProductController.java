package com.example.searchrestapi.controller;


import com.example.searchrestapi.entity.Product;
import com.example.searchrestapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController
{
    private ProductService productService;

    public ProductController() {
    }

    @Autowired
    public ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query)
    {
        return ResponseEntity.ok().body(productService.searchProducts(query));
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody  Product product)
    {
        return productService.createProduct(product);

    }
    @GetMapping("/products")
    public List<Product> createProduct()
    {
        return productService.createProduct();
    }

    @PutMapping("/products/{id}")
    public void updateProduct(@RequestBody Product product,@PathVariable long id)
    {
        productService.updateProduct(product,id);
    }



    




}
