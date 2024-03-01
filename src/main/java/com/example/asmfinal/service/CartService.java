package com.example.asmfinal.service;

import com.example.asmfinal.entity.Cart;

import java.util.List;

public interface CartService {
    Cart save(Cart cart);
    List<Cart> listCart();
    Cart findOne(Integer id);
    void deleteByid(Integer id);
    Double totalPrice();
    Cart  update(Integer id,int qty);
    void deleteAll();
}
