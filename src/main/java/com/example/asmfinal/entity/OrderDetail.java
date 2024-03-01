package com.example.asmfinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer orderDetail_id;
    @ManyToOne @JoinColumn(name = "order_id")
    Order order;
    @ManyToOne @JoinColumn(name = "product_id")
    Products products;
    Integer quantity;
    Double price;
    Double subtotal;

}
