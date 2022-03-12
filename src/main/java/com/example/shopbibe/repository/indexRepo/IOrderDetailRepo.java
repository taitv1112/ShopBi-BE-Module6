package com.example.shopbibe.repository.indexRepo;

import com.example.shopbibe.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IOrderDetailRepo extends JpaRepository<OrderDetail,Long> {
    @Query(nativeQuery = true,value = "SELECT * FROM shopbi.order_detail where orders_id = :id")
        List<OrderDetail> findAllOrderDetailByOrderId(@Param("id") long id);
}
