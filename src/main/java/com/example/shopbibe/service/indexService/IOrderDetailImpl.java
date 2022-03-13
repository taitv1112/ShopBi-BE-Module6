package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.OrderDetail;
import com.example.shopbibe.model.Orders;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IOrderDetailImpl {
    void saveOrderDetail(OrderDetail orderDetail);
    List<OrderDetail> findAllOrderDetailByOrderId( long userId, long orderId);
}
