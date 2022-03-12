package com.example.shopbibe.repository.indexRepo;

import com.example.shopbibe.model.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IOrderRepo extends JpaRepository<Orders,Long> {
}
