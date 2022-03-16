package com.example.shopbibe.repository.indexRepo;

import com.example.shopbibe.model.OrderDetail;
import com.example.shopbibe.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IOrderDetailRepo extends JpaRepository<OrderDetail,Long> {
    @Query(nativeQuery = true,value = "select order_detail.* from order_detail join orders on orders.id=order_detail.orders_id  where (order_detail.product_id in (select product.id from product where user_id =:userId)) and orders_id =:orderId ")
        List<OrderDetail> findAllOrderDetailByOrderId(@Param("userId") long userId,@Param("orderId") long orderId);

    @Query(nativeQuery = true,value = "SELECT * FROM shopbi.order_detail where orders_id =:id")
    List<OrderDetail> findAllOrderById(@Param("id") long id);
}
