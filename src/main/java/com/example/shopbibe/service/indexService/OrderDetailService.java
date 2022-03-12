package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.OrderDetail;
import com.example.shopbibe.repository.indexRepo.IOrderDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService implements IOrderDetailImpl{
    @Autowired
    IOrderDetailRepo iOrderDetailRepo;

    @Override
    public void saveOrderDetail(OrderDetail orderDetail) {
         iOrderDetailRepo.save(orderDetail);
    }

    @Override
    public void deleteOrderDetail(long  id) {
        iOrderDetailRepo.deleteById(id);
    }
}
