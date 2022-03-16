package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.Orders;
import com.example.shopbibe.model.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IOrderImpl {
    void save( Orders orders);
    List<Orders> findAllByStatus(long id,String status);

    List<Orders> findAllByUserPmAndUserBuyer(long idPm, long idBuyer);

    List<Orders> findAllOrderById(@Param("id") long id);

}
