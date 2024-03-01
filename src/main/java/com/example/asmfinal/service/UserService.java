package com.example.asmfinal.service;

import com.example.asmfinal.entity.User;

import java.util.List;


public interface UserService {
    List<User> getListUser();
    User save(User user);
    User findByEmail(String email);
    User findById(Integer id);
}
