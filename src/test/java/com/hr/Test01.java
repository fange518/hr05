package com.hr;

import com.hr.entity.User;
import com.hr.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test01 {

    @Autowired
    private UserService userService;
    @Test //无参，无返回值
    public void test01(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = (UserService) context.getBean("userService");
        List<User> users = userService.queryUsers();
        users.forEach(System.out::println);
    }
}
