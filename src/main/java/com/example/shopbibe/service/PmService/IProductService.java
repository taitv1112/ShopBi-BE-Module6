package com.example.shopbibe.service.PmService;

import com.example.shopbibe.dto.response.Top3Category;
import com.example.shopbibe.model.Category;
import com.example.shopbibe.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product save(Product product);

    void delete(long id);

    Product findById(long id);
    Page<Product> findAllByCategory(Pageable pageable,long idCate);
    Page<Product> findAllByUser(Pageable pageable,long idPm);
    Page<Product> findAllProductPage(Pageable pageable);
    Page<Product> findAllByNameContaining(Pageable pageable,String nameFind);
    public  List<Category> top3Categories();
}
