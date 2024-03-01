package com.example.asmfinal.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer user_id;
    String user_password;
    String fullname;
    String email;
    Boolean active = true;
    @OneToMany(mappedBy = "user")
    List<Order> orders;
}
