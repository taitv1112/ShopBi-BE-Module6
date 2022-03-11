package com.example.shopbibe.service.PmService;

import com.example.shopbibe.model.Product;
import com.example.shopbibe.repository.PmRepo.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements IProductService{
    @Autowired
    IProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product findById(long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Page<Product> findAllByCategory(Pageable pageable,long idCate) {
        return productRepository.findAllByCategoryId(pageable,idCate);
    }

    @Override
    public Page<Product> findAllByUser(Pageable pageable,long idPm) {
        return productRepository.findAllByUserId(pageable,idPm);
    }

    @Override
    public Page<Product> findAllProductPage(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Page<Product> findAllByNameContaining(Pageable pageable, String nameFind) {
        return productRepository.findAllByNameContaining(pageable,nameFind);
    }

    @Override
    public List<Product> findAllByNameAndCategory(String name, Long id) {
        return productRepository.findAllByNameAndCategory(name,id);
    }


}
