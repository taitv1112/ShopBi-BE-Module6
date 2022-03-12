package com.example.shopbibe.controller.PmController;

import com.example.shopbibe.model.Img;
import com.example.shopbibe.model.Product;
import com.example.shopbibe.service.PmService.IImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/img")
public class ImgController {
    @Autowired
    IImgService imgService;

    @PostMapping
    public ResponseEntity<Img> save(@RequestBody Img img){
        return new ResponseEntity<>(imgService.save(img), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        imgService.delete(id);
    }

    @PutMapping
    public Img edit(@RequestBody Img img){
        imgService.save(img);
        return img;
    }


}
