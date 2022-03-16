package com.example.shopbibe.repository.PmRepo;

import com.example.shopbibe.dto.response.Top3Category;
import com.example.shopbibe.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Long> {
   Page<Product> findAllByCategoryId(Pageable pageable,long id);
   Page<Product> findAllByUserId(Pageable pageable,long idUser);
   Page<Product> findAll(Pageable pageable);
   Page<Product> findAllByNameContaining(Pageable pageable,String nameFind);

   @Query(nativeQuery = true, value = "SELECT * FROM shopbi.product where name like concat('%',:name,'%')")
   List<Product> findAllByName(@Param("name") String name);

   @Query(nativeQuery = true, value = "SELECT * FROM shopbi.product where category_id =:id")
   List<Product> findAllByCategory(@Param("id") Long id);

   @Query(nativeQuery = true,value = "SELECT sum(quantity_sale) as sumQ,category_id as cateId FROM shopbi.product  group by category_id order by sumQ desc limit 3 ")
   List<Top3Category> top3CateByQuantitySale();
}
