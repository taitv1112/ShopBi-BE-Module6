package com.example.shopbibe.service.indexService;

import com.example.shopbibe.dto.request.OrderForm;
import com.example.shopbibe.model.Orders;

import java.util.List;

public interface IOrderImpl {
    void saveOrder( Orders orders);
    void  checkOutOrder(OrderForm orderForm);
    List<Orders> findAllByStatus(long id,String status);

}
