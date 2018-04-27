package com.controller;

import com.entity.Product;
import com.repository.ProductRepository;
import com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {


    @Autowired
    ProductService productService;


    @GetMapping
    public List<Product> getProducts() {
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        return productService.getProducts();
    }

    @PostMapping
    public Product saveProduct(Product product) {
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        productService.saveProduct(product);

        return product;
    }

    @DeleteMapping("/{pid}")
    public int removeProductById(@PathVariable("pid") Integer pid) {
        return productService.removeProduct(pid);
    }




}
