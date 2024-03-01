package com.example.asmfinal.reponsitory;

import com.example.asmfinal.entity.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDetailsRepo extends JpaRepository<ProductDetail,Integer> {
}
