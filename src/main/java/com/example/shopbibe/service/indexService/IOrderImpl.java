package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.Orders;

import java.util.List;

public interface IOrderImpl {
    void save( Orders orders);
    List<Orders> findAllByStatus(long id,String status);

}
