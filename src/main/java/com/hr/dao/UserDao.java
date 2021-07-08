package com.hr.dao;

import com.hr.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

   public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User(1,"admin","123"));
        users.add(new User(1,"admin","123"));
        users.add(new User(1,"admin","123"));
        users.add(new User(1,"admin","123"));
        users.add(new User(1,"admin","123"));

        return users;
    }
}
