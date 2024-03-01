package com.example.asmfinal.reponsitory;

import com.example.asmfinal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    @Query("select u from User u where u.email like ?1")
    User findByEmail(String email);
    @Query("select u from User u where u.user_id =?1")
    User findByUser_id(Integer id);
}
