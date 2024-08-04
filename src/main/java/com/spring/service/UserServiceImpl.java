package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();

    // 通过 set() 实现动态注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
