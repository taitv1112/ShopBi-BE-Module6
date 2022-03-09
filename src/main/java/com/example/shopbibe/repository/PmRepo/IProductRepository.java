package com.example.shopbibe.repository.PmRepo;

import com.example.shopbibe.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
