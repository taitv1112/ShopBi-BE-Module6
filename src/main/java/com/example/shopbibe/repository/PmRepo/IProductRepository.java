package com.example.shopbibe.repository.PmRepo;

import com.example.shopbibe.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
   Page<Product> findAllByCategoryId(Pageable pageable,long id);
   Page<Product> findAllByUserId(Pageable pageable,long idUser);
   Page<Product> findAll(Pageable pageable);
   Page<Product> findAllByNameContaining(Pageable pageable,String nameFind);
}
