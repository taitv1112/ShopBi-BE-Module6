package com.example.shopbibe.repository.indexRepo;

import com.example.shopbibe.model.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IOrderRepo extends JpaRepository<Orders,Long> {
    @Query(nativeQuery = true,value = "SELECT * FROM shopbi.orders where user_id = :id and status = :status")
    List<Orders> findAllOrderByUserIdAndStatus(@Param("id") long id,@Param("status") String status );
}
