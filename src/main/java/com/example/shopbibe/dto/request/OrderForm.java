package com.example.shopbibe.dto.request;

import com.example.shopbibe.model.OrderDetail;
import com.example.shopbibe.model.Orders;

import java.util.List;

public class OrderForm {
    private Orders orders;
    private List<OrderDetail> orderDetailList;

    public OrderForm() {
    }

    public OrderForm(Orders orders, List<OrderDetail> orderDetailList) {
        this.orders = orders;
        this.orderDetailList = orderDetailList;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}
