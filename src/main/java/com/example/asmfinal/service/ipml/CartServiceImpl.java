package com.example.asmfinal.service.ipml;

import com.example.asmfinal.entity.Cart;
import com.example.asmfinal.reponsitory.CartRepo;
import com.example.asmfinal.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    @Autowired
    CartRepo cartRepo;
    List<Cart> list=new ArrayList<>();
    @Override
    public Cart save(Cart cart) {
        return cartRepo.save(cart);
    }

    @Override
    public List<Cart> listCart() {
        return cartRepo.findAll();
    }

    @Override
    public Cart findOne(Integer id) {
        return cartRepo.findOne(id);

    }
    @Override
    public void deleteByid(Integer id) {
        cartRepo.deleteById(id);
    }

    @Override
    public Double totalPrice() {
        return cartRepo.TotalPrice();
    }

    @Override
    public Cart update(Integer id, int qty) {
        Cart cart=cartRepo.findOne(id);
        cart.setQuantity(qty);
        return cartRepo.save(cart);
    }

    @Override
    public void deleteAll() {
        cartRepo.deleteAll();
    }

//    private static int find_index(List<Cart> list,Cart cart){
//        for (int i = 0; i < list.size() ; i++) {
//            if (list.get(i).getProduct_cart_id()==cart.getProduct_cart_id()){
//                return i;
//            }
//        }
//        return -1;
//    }
}
