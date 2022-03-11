package com.example.shopbibe.service.indexService;

import com.example.shopbibe.dto.request.OrderForm;
import com.example.shopbibe.model.OrderDetail;
import com.example.shopbibe.model.Orders;
import com.example.shopbibe.repository.indexRepo.IOrderDetailRepo;
import com.example.shopbibe.repository.indexRepo.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderImpl{
    @Autowired
    IOrderRepo iOrderRepo;
    @Autowired
    IOrderDetailRepo iOrderDetailRepo;
    @Override
    public void saveOrder(Orders orders) {
         iOrderRepo.save(orders);
    }

    @Override
    public void checkOutOrder(OrderForm orderForm) {
        Orders orders = orderForm.getOrders();
        orders.setStatus("Pending");
        saveOrder(orders);
        List<OrderDetail> orderDetailList = orderForm.getOrderDetailList();
        for (OrderDetail orderDetailO: orderDetailList
             ) {
            iOrderDetailRepo.save(orderDetailO);
        }
    }

}
