package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.OrderDetail;
import com.example.shopbibe.repository.indexRepo.IOrderDetailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService implements IOrderDetailImpl{
    @Autowired
    IOrderDetailRepo iOrderDetailRepo;

    @Override
    public void save(OrderDetail orderDetail) {
         iOrderDetailRepo.save(orderDetail);
    }

    @Override
    public List<OrderDetail> findAllOrderDetailByOrderId(long userId, long orderId) {
        return iOrderDetailRepo.findAllOrderDetailByOrderId(userId,orderId);
    }


}
