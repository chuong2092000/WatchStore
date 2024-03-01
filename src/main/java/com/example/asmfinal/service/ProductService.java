package com.example.asmfinal.service;

import com.example.asmfinal.entity.Products;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Products> listProduct();
    Optional<Products> findById(Integer id);
    List<Products> listProductMen(String userTarget);
    Products save(Products products);
    Products findByIdOne(Integer id);
}
