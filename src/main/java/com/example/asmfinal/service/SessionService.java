package com.example.asmfinal.service;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class SessionService {
    @Autowired
    HttpSession session;
    public void setAttribute(String name, String value){
        session.setAttribute(name,value);

    }
    public void setAttribute(String name, List value){
        session.setAttribute(name,value);

    }
    public <T> T  getAttibute(String name){
        return (T) session.getAttribute(name);
    }
    public void removeAttribute(String name){
        session.removeAttribute(name);
    }
}
