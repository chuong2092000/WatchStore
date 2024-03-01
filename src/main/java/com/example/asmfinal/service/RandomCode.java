package com.example.asmfinal.service;

import java.util.Random;

public class RandomCode {
    public static String code(){
        Random random=new Random();
        StringBuilder str=new StringBuilder();
        for (int i=0;i<=6;i++){
            str.append(random.nextInt(10));
        }
        return  str.toString();
    }
}
