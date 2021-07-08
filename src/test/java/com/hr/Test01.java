package com.hr;

import com.hr.entity.User;
import com.hr.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test01 {

    @Test //无参，无返回值
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        List<User> users = userService.queryUsers();
        users.forEach(System.out::println);
    }
}
