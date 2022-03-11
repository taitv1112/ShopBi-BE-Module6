package com.example.shopbibe.service.indexService;

import com.example.shopbibe.model.CartDetail;

import java.util.List;

public interface ICartDetailService  {

    List<CartDetail> findCartDetailsByCart_Id(Long id);
}
