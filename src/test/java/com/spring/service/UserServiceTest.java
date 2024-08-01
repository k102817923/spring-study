package com.spring.service;

import org.junit.Test;

public class UserServiceTest {
    @Test
    public void getUser() {
        // 实际调用的是业务层，不需要接触 dao 层
        UserService userService = new UserServiceImpl();
        userService.getUser();
    }
}
