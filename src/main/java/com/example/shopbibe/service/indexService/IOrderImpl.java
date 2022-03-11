package com.example.shopbibe.service.indexService;

import com.example.shopbibe.dto.request.OrderForm;
import com.example.shopbibe.model.Orders;

public interface IOrderImpl {
    void saveOrder( Orders orders);
    void  checkOutOrder(OrderForm orderForm);
}
