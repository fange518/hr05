package com.hr.service;

import com.hr.dao.UserDao;
import com.hr.entity.User;

import java.util.List;

public class UserService {


    private UserDao userDao;

    public List<User> queryUsers(){
        List<User> users = userDao.getAllUsers();
        return users;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
