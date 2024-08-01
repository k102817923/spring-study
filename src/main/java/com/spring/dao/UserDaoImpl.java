package com.spring.dao;

import com.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("默认获取用户数据");
    }
}
