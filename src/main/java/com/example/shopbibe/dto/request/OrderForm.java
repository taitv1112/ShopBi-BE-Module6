package com.example.shopbibe.dto.request;

import com.example.shopbibe.model.OrderDetail;
import com.example.shopbibe.model.Orders;

import java.util.List;

public class OrderForm {
    private List<Orders> orders;
    private List<OrderDetail> orderDetailList;

    public OrderForm() {
    }

    public OrderForm(List<Orders> orders, List<OrderDetail> orderDetailList) {
        this.orders = orders;
        this.orderDetailList = orderDetailList;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }
}
