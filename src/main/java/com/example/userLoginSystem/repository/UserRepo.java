package com.example.userLoginSystem.repository;

import com.example.userLoginSystem.entity.User;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUserName(String username);
}
