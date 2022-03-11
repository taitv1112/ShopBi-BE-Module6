package com.example.shopbibe.repository.PmRepo;

import com.example.shopbibe.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Long> {
   Page<Product> findAllByCategoryId(Pageable pageable,long id);
   Page<Product> findAllByUserId(Pageable pageable,long idUser);
   Page<Product> findAll(Pageable pageable);
   Page<Product> findAllByNameContaining(Pageable pageable,String nameFind);

   @Query(nativeQuery = true, value = "SELECT * FROM shopbi.product where name = :name and category_id = :id")
   List<Product> findAllByNameAndCategory(@Param("name") String name, @Param("id")Long id);
}
