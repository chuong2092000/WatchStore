package com.example.asmfinal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer product_cart_id ;
    Integer product_id_temp;
    String product_img;
    String product_name;
    Integer quantity;
    Double price;
    Double total;
}
