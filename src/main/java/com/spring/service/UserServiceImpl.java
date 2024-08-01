package com.spring.service;

import com.spring.dao.UserDao;
import com.spring.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {

    @Override
    public void getUser() {
        UserDao userDao = new UserDaoImpl();
        userDao.getUser();
    }
}
