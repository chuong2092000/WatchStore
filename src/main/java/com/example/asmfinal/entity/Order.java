package com.example.asmfinal.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer order_id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
    @Temporal(TemporalType.DATE)
    Date order_date=new Date();
    String status="Đã Đặt Hàng";
    String order_address;
    String phone_number;
    @OneToMany (mappedBy = "order")
    List<OrderDetail> listOrderdetail;

}
