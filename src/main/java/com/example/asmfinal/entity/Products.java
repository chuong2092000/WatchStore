package com.example.asmfinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Products implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer product_id;
    String product_name;
    @ManyToOne @JoinColumn(name = "brand_id")
    Brands brands;
    @ManyToOne @JoinColumn(name = "category_id")
    Categories categories;
    Double price;
    String Product_description;
    Integer stock_quantity;
    @OneToMany (mappedBy = "products")
    List<ProductImage> list;

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", brands=" + brands +
                ", categories=" + categories +
                ", price=" + price +
                ", _description='" + Product_description + '\'' +
                ", stock_quantity=" + stock_quantity +
                ", list=" + list +
                '}';
    }
}
