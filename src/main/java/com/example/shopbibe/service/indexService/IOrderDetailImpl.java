package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.OrderDetail;
import com.example.shopbibe.model.Orders;

public interface IOrderDetailImpl {
    void saveOrderDetail(OrderDetail orderDetail);
    void  deleteOrderDetail(long id);
}
