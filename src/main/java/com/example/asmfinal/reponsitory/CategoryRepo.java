package com.example.asmfinal.reponsitory;

import com.example.asmfinal.entity.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Categories,Integer> {
}
