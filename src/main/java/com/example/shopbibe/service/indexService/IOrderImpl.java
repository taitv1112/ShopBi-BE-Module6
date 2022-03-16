package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.Orders;
import com.example.shopbibe.model.User;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IOrderImpl {
    void save( Orders orders);
    List<Orders> findAllByStatus(long id,String status);
     Orders findByID(long id);
     List<Orders> findAllOrder(long id);
    List<Orders> searchByEmailUser(  long idPm, String emailFind);
}
