package com.example.asmfinal.service.ipml;

import com.example.asmfinal.entity.ProductDetail;
import com.example.asmfinal.reponsitory.ProductDetailsRepo;
import com.example.asmfinal.service.Product_DetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class Product_DetailImpl implements Product_DetailService {
    final ProductDetailsRepo productDetailsRepo;
    @Override
    public Optional<ProductDetail> PRODUCT_DETAIL_ONE(Integer id) {
        return productDetailsRepo.findById(id);
    }

    @Override
    public ProductDetail save(ProductDetail productDetail) {
        return productDetailsRepo.save(productDetail);
    }

    @Override
    public List<ProductDetail> listProductDetail() {
        return productDetailsRepo.findAll();
    }
}
