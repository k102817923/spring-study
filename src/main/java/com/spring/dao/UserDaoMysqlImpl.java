package com.spring.dao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取 MySQL 用户数据");
    }
}
