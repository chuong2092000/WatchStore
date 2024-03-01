package com.example.asmfinal.service;

import com.example.asmfinal.entity.ProductDetail;

import java.util.List;
import java.util.Optional;

public interface Product_DetailService {
    Optional<ProductDetail> PRODUCT_DETAIL_ONE(Integer id);
    ProductDetail save(ProductDetail productDetail);
    List<ProductDetail> listProductDetail();
}
