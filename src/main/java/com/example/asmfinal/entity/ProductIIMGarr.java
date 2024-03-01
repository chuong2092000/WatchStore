package com.example.asmfinal.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductIIMGarr {
    String[] arrImage;

    @Override
    public String toString() {
        return "ProductIIMGarr{" +
                "arrImage=" + Arrays.toString(arrImage) +
                '}';
    }
}
