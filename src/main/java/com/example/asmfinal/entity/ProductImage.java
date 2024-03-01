package com.example.asmfinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Product_images")
public class ProductImage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer product_image_id;

    Integer image_number;
    String image_url;
    @ManyToOne @JoinColumn(name = "product_id")
    Products products;

    @Override
    public String toString() {
        return "ProductImage{" +
                "product_image_id=" + product_image_id +
                ", image_number=" + image_number +
                ", image_url='" + image_url + '\'' +
                ", products=" + products +
                '}';
    }
}
