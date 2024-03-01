package com.example.asmfinal.service;

import com.example.asmfinal.entity.ProductImage;

import java.util.List;

public interface ProductImageService {
    List<ProductImage> listProductImage();
    ProductImage save(ProductImage productImage);
}
