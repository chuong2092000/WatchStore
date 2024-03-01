package com.example.asmfinal.service.ipml;

import com.example.asmfinal.entity.Brands;
import com.example.asmfinal.reponsitory.BrandRepo;
import com.example.asmfinal.service.BrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BrandImpl implements BrandService {
    @Autowired
    BrandRepo brandRepo;
    @Override
    public List<Brands> listBrand() {
        return brandRepo.findAll();
    }
}
