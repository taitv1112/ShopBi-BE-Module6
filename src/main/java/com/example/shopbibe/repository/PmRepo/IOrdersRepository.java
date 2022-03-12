package com.example.shopbibe.repository.PmRepo;

import com.example.shopbibe.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdersRepository extends JpaRepository<Orders,Long> {

}
