package com.example.userLoginSystem.Service;

import com.example.userLoginSystem.entity.Users;
import com.example.userLoginSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userrepo;

    public Users register(Users user){

        return userrepo.save(user);

    }
}
