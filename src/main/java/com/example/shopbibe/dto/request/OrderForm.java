package com.example.shopbibe.dto.request;

import com.example.shopbibe.model.OrderDetail;
import com.example.shopbibe.model.Orders;

import java.util.List;

public class OrderForm {
    private Orders orders;
    private List<OrderDetail> orderDetails;

    public OrderForm(Orders orders, List<OrderDetail> orderDetails) {
        this.orders = orders;
        this.orderDetails = orderDetails;
    }
}
