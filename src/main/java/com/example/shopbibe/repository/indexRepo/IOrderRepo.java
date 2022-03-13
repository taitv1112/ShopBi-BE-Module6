package com.example.shopbibe.repository.indexRepo;

import com.example.shopbibe.model.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IOrderRepo extends JpaRepository<Orders,Long> {
    @Query(nativeQuery = true,value = "select orders.* from order_detail join orders on orders.id=order_detail.orders_id  where orders.status=:status and (order_detail.product_id in (select product.id from product where user_id =:id))  group by orders.id")
    List<Orders> findAllOrderByUserIdAndStatus(@Param("id") long id,@Param("status") String status );
}
