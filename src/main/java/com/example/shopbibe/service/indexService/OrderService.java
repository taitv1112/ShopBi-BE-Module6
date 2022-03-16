package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.Orders;

import com.example.shopbibe.repository.PmRepo.IProductRepository;
import com.example.shopbibe.repository.indexRepo.IOrderDetailRepo;
import com.example.shopbibe.repository.indexRepo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderImpl{
    @Autowired
    IOrderRepo iOrderRepo;
    @Autowired
    IOrderDetailRepo iOrderDetailRepo;
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public void save(Orders orders) {
         iOrderRepo.save(orders);
    }

    @Override
    public List<Orders> findAllByStatus(long id,String status) {
        return iOrderRepo.findAllOrderByUserIdAndStatuss(id,status);
    }

    @Override
    public Orders findByID(long id) {
        return iOrderRepo.findById(id).get();
    }

    @Override
    public List<Orders> findAllOrder(long id) {
        return iOrderRepo.findAllOrder(id);
    }

    @Override
    public List<Orders> searchByEmailUser(long idPm, String emailFind) {

        return iOrderRepo.searchByEmailUser(idPm,emailFind);
    }


}
