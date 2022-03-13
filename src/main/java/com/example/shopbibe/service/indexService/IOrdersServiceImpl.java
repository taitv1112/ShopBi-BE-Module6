package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.Orders;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IOrdersServiceImpl {
    Page<Orders> findAllOrder(Pageable pageable);
    Orders saveOrder(Orders orders);



}
