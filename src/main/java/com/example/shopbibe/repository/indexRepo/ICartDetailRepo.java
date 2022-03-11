package com.example.shopbibe.repository.indexRepo;

import com.example.shopbibe.model.CartDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICartDetailRepo extends JpaRepository<CartDetail,Long> {

}
