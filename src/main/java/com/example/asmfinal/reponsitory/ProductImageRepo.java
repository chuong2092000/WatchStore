package com.example.asmfinal.reponsitory;

import com.example.asmfinal.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductImageRepo extends JpaRepository<ProductImage,Integer> {
}
