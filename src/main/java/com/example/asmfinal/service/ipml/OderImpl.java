package com.example.asmfinal.service.ipml;

import com.example.asmfinal.entity.Order;
import com.example.asmfinal.reponsitory.OrderRepo;
import com.example.asmfinal.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class OderImpl implements OrderService {
    @Autowired
    OrderRepo orderRepo;
    @Override
    public Order save(Order order) {
        return orderRepo.save(order);
    }
}
