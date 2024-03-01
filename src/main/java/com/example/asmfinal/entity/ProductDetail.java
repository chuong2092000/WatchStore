package com.example.asmfinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ProductDetails")
public class ProductDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer  product_detail_id;
    @OneToOne @JoinColumn(name = "product_id")
    Products products;
    String sku;
    String user_target;
    String movement;
    String  glass_material;
    Boolean water_resistance;
    String origin;
    String shape;
    String case_color;
    Boolean Product_condition;
    String dial_color;

    @Override
    public String toString() {
        return "ProductDetail{" +
                "product_detail_id=" + product_detail_id +
                ", products=" + products +
                ", sku='" + sku + '\'' +
                ", user_target='" + user_target + '\'' +
                ", movement='" + movement + '\'' +
                ", glass_material='" + glass_material + '\'' +
                ", water_resistance=" + water_resistance +
                ", origin='" + origin + '\'' +
                ", shape='" + shape + '\'' +
                ", case_color='" + case_color + '\'' +
                ", _condition=" + Product_condition+
                ", dial_color='" + dial_color + '\'' +
                '}';
    }
}
