package com.example.asmfinal.reponsitory;

import com.example.asmfinal.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Products,String> {
    @Query("select p from Products p inner join ProductDetail o on p.product_id=o.products.product_id where o.user_target like ?1")
    List<Products> listProductMen(String userTarget);
    @Query("select p from Products p where p.product_id = ?1")
    Products findByProduct_id(Integer id);

}
