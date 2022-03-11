package com.example.shopbibe.repository.indexRepo;

import com.example.shopbibe.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrderDetailRepo extends JpaRepository<OrderDetail,Long> {

}
