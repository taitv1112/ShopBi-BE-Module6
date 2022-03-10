package com.example.shopbibe.controller.indexController;

import com.example.shopbibe.model.Product;
import com.example.shopbibe.service.PmService.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/index")
public class InDexController {
    @Autowired
    IProductService iProductService;
    @GetMapping("/category/{idCate}")
    public ResponseEntity<Page<Product>> findAllByCategory(@PathVariable long idCate,@RequestParam(defaultValue = "0") int pageNumber){
        return new ResponseEntity<>(iProductService.findAllByCategory(PageRequest.of(pageNumber,5, Sort.by("quantitySale").descending()),idCate), HttpStatus.ACCEPTED);
    }
    @GetMapping("/pm/{idPm}")
    public ResponseEntity<Page<Product>> findAllByPm(@PathVariable long idPm,@RequestParam(defaultValue = "0") int pageNumber){
        return new ResponseEntity<>(iProductService.findAllByUser(PageRequest.of(pageNumber,5, Sort.by("quantitySale").descending()),idPm), HttpStatus.ACCEPTED);
    }

    @GetMapping("/bestSale")
    public ResponseEntity<Page<Product>> findAllByBestSale(@RequestParam(defaultValue = "0") int pageNumber){
        return new ResponseEntity<>(iProductService.findAllProductPage(PageRequest.of(pageNumber,10, Sort.by("quantitySale").descending())), HttpStatus.ACCEPTED);
    }
    @GetMapping("/detail/{idProduct}")
    public ResponseEntity<Product> detailProduct(@PathVariable long idProduct){
        return new ResponseEntity<>(iProductService.findById(idProduct),HttpStatus.ACCEPTED);
    }
    @GetMapping("/search/{nameFind}")
    public ResponseEntity<Page<Product>> findAllByName(@PathVariable String nameFind,@RequestParam(defaultValue = "0") int pageNumber){
        return new ResponseEntity<>(iProductService.findAllByNameContaining(PageRequest.of(pageNumber,5),nameFind),HttpStatus.ACCEPTED);
    }








}
