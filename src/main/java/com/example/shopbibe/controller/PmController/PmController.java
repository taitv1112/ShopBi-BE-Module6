package com.example.shopbibe.controller.PmController;

import com.example.shopbibe.model.Category;
import com.example.shopbibe.model.Product;
import com.example.shopbibe.model.Promotion;
import com.example.shopbibe.service.PmService.ICategoryService;
import com.example.shopbibe.service.PmService.IProductService;
import com.example.shopbibe.service.PmService.IPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/pm")
public class PmController {
    @Autowired
    ICategoryService categoryService;

    @Autowired
    IProductService productService;

    @Autowired
    IPromotionService promotionService;

    @GetMapping("/product")
    public ResponseEntity<List<Product>> findAllProduct(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/category")
    public ResponseEntity<List<Category>> findAllCategory(){
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/promotion")
    public ResponseEntity<List<Promotion>> findAllPromotion(){
        return new ResponseEntity<>(promotionService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable long id){
        return new ResponseEntity<>(productService.findById(id),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> save(@RequestBody Product product){
        return new ResponseEntity<>(productService.save(product),HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        productService.delete(id);
    }

    @PutMapping
    public Product edit(@RequestBody Product product){
        productService.save(product);
        return product;
    }

}
