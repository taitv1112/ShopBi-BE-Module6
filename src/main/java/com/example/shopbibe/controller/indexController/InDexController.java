package com.example.shopbibe.controller.indexController;

import com.example.shopbibe.dto.response.Top3Category;
import com.example.shopbibe.model.Category;
import com.example.shopbibe.model.Product;
import com.example.shopbibe.service.PmService.ICategoryService;
import com.example.shopbibe.service.PmService.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/index")
public class InDexController {
    @Autowired
    IProductService iProductService;
    @Autowired
    ICategoryService categoryService;
    // ham tra list sp theo categoryid truyen sang,sap xep theo quantitysale da phan trang
    @GetMapping("/category/{idCate}")
    public ResponseEntity<Page<Product>> findAllByCategory(@PathVariable long idCate,@RequestParam(defaultValue = "0") int pageNumber){
        return new ResponseEntity<>(iProductService.findAllByCategory(PageRequest.of(pageNumber,5, Sort.by("quantitySale").descending()),idCate), HttpStatus.ACCEPTED);
    }
    @GetMapping("/category")
    public ResponseEntity<List<Category>> findAllCategory(){
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.ACCEPTED);
    }
    // ham tra list sp theo userID truyen sang,sap xep theo quantitysale da phan trang
    @GetMapping("/pm/{idPm}")
    public ResponseEntity<Page<Product>> findAllByPm(@PathVariable long idPm,@RequestParam(defaultValue = "0") int pageNumber){
        return new ResponseEntity<>(iProductService.findAllByUser(PageRequest.of(pageNumber,5, Sort.by("quantitySale").descending()),idPm), HttpStatus.ACCEPTED);
    }
    // ham tra list sp theo sap xep theo quantitysale giamr dan da phan trang
    @GetMapping("/bestSale")
    public ResponseEntity<Page<Product>> findAllByBestSale(@RequestParam(defaultValue = "0") int pageNumber){
        return new ResponseEntity<>(iProductService.findAllProductPage(PageRequest.of(pageNumber,10, Sort.by("quantitySale").descending())), HttpStatus.ACCEPTED);
    }
    // ham tra ve 1 doi tuong product theo id truyen sang
    @GetMapping("/detail/{idProduct}")
    public ResponseEntity<Product> detailProduct(@PathVariable long idProduct){
        return new ResponseEntity<>(iProductService.findById(idProduct),HttpStatus.ACCEPTED);
    }
    // tra ve list san pham duoc tim theo keyword truyen sang da phan trang
    @GetMapping("/search/{nameFind}")
    public ResponseEntity<Page<Product>> findAllByName(@PathVariable String nameFind,@RequestParam(defaultValue = "0") int pageNumber){
        return new ResponseEntity<>(iProductService.findAllByNameContaining(PageRequest.of(pageNumber,5),nameFind),HttpStatus.ACCEPTED);
    }

    @GetMapping("/top3Cate")
    public ResponseEntity<List<Category>> top3Categories(){
        return new ResponseEntity<>(iProductService.top3Categories(),HttpStatus.ACCEPTED);
    }






}
