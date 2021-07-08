package com.hr.service;

import com.hr.dao.UserDao;
import com.hr.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//@Scope("signleton")//单例，默认
@Scope("prototype")//多例
public class UserService {
    //自动装配
    @Autowired

    private UserDao userDao;

    public List<User> queryUsers(){
        List<User> users = userDao.getAllUsers();
        return users;
    }

    public User getUser(){
        return new User(1,"zhangsan","123");
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
