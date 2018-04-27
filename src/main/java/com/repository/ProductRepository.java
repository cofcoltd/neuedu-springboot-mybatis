package com.repository;

import com.entity.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> queryProducts();

    int saveProduct(Product product);

    int removeProductById(Integer pid);



}
