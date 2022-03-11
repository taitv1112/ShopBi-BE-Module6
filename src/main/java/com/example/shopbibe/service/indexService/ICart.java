package com.example.shopbibe.service.indexService;

import com.example.shopbibe.dto.request.CartForm;
import com.example.shopbibe.model.Cart;

public interface ICart {
    void saveCart(CartForm cartForm);
    Cart findCartByUserName(String username);

}
