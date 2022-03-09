package com.example.shopbibe.service.PmService;

import com.example.shopbibe.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product save(Product product);

    void delete(long id);

    Product findById(long id);
}
