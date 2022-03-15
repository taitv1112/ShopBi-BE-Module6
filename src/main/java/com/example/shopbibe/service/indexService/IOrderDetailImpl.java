package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.OrderDetail;

import java.util.List;

public interface IOrderDetailImpl {
    void save(OrderDetail orderDetail);
    List<OrderDetail> findAllOrderDetailByOrderId( long userId, long orderId);
}
