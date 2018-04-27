package com.service;

import com.entity.Product;
import com.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    public int saveProduct(Product product) {
        int rows = productRepository.saveProduct(product);
//        int error = 1/0;
        return rows;
    }

    public List<Product> getProducts() {
        return productRepository.queryProducts();
    }

    public int removeProduct(Integer pid) {
        return productRepository.removeProductById(pid);
    }

}
