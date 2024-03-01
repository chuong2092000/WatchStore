package com.example.asmfinal.reponsitory;

import com.example.asmfinal.entity.Brands;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepo extends JpaRepository<Brands,Integer> {
}
