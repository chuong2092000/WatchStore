package com.example.asmfinal.service.ipml;

import com.example.asmfinal.entity.ProductImage;
import com.example.asmfinal.reponsitory.ProductImageRepo;
import com.example.asmfinal.service.ProductImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class ProductImageimpl implements ProductImageService {
    final ProductImageRepo productImageRepo;
    @Override
    public List<ProductImage> listProductImage() {
        return productImageRepo.findAll();
    }

    @Override
    public ProductImage save(ProductImage productImage) {
        return productImageRepo.save(productImage);
    }
}
