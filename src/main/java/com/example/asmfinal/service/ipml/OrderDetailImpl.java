package com.example.asmfinal.service.ipml;

import com.example.asmfinal.entity.OrderDetail;

import com.example.asmfinal.reponsitory.OrderDetailRepo;
import com.example.asmfinal.service.OderDetailService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderDetailImpl implements OderDetailService {
    @Autowired
    OrderDetailRepo orderDetailRepo;
    @Override
    public OrderDetail save(OrderDetail orderDetail) {
        return orderDetailRepo.save(orderDetail);
    }
}
