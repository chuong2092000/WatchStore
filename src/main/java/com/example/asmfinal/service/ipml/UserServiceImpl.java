package com.example.asmfinal.service.ipml;

import com.example.asmfinal.entity.User;
import com.example.asmfinal.reponsitory.UserRepo;
import com.example.asmfinal.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;
    @Override
    public List<User> getListUser() {
        return userRepo.findAll();
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }

    @Override
    public User findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public User findById(Integer id) {
        return userRepo.findByUser_id(id);
    }
}
