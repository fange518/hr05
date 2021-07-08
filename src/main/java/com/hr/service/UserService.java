package com.hr.service;

import com.hr.dao.UserDao;
import com.hr.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    //自动装配
    @Autowired

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
