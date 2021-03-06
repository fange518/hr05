package com.hr;

import com.hr.entity.User;
import com.hr.service.NewsService;
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

    @Autowired//查找容器中和userService类型一样的bean，注入
    private UserService userService;
    @Autowired//查找容器中和userService类型一样的bean，注入
    private NewsService newsService;
    @Test //无参，无返回值
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       UserService userService = (UserService) context.getBean("userService");
//        UserService userService2 = (UserService) context.getBean("userService");
//        System.out.println(userService == userService2);
        List<User> users = userService.queryUsers();
        users.forEach(System.out::println);
    }
    @Test
    public void test02(){
        User user = userService.getUser();
        System.out.println(user);

    }
    @Test
    public void test03(){
        newsService.insert();

    }
}
