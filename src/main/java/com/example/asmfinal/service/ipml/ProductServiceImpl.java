package com.example.asmfinal.service.ipml;

import com.example.asmfinal.entity.Products;
import com.example.asmfinal.reponsitory.ProductRepo;
import com.example.asmfinal.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    final ProductRepo productRepo;
    @Override
    public List<Products> listProduct() {
        return productRepo.findAll();
    }

    @Override
    public Optional<Products> findById(Integer id) {
        return productRepo.findById(id+"");
    }

    @Override
    public List<Products> listProductMen(String userTarget) {
        return productRepo.listProductMen(userTarget);
    }

    @Override
    public Products save(Products products) {
        return productRepo.save(products);
    }

    @Override
    public Products findByIdOne(Integer id) {
        return productRepo.findByProduct_id(id);
    }
}
