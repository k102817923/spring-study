package com.spring.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    @Test
    public void getUser() {
        // 实际调用的是业务层，不需要接触 dao 层
//        UserService userService = new UserServiceImpl();
//        userService.getUser();

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.getUser();
    }

    @Test
    public void myTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.add();
//        userService.getUser();
    }
}
