package com.example.asmfinal.service.ipml;

import com.example.asmfinal.entity.Categories;
import com.example.asmfinal.reponsitory.CategoryRepo;
import com.example.asmfinal.service.CateGoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryImpl implements CateGoryService {
    @Autowired
    CategoryRepo categoryRepo;
    @Override
    public List<Categories> listCategory() {
        return categoryRepo.findAll();
    }
}
