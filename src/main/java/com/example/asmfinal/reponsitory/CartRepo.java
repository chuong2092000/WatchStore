package com.example.asmfinal.reponsitory;

import com.example.asmfinal.entity.Cart;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends JpaRepository<Cart,Integer> {
        @Query("select c from Cart c where c.product_id_temp = ?1")
        Cart findOne(Integer id);
        @Query("select sum(c.total) from Cart c")
        Double TotalPrice();
}
