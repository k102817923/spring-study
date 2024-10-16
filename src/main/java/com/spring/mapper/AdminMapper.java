package com.spring.mapper;

import com.spring.pojo.Admin;

import java.util.List;

public interface AdminMapper {
    List<Admin> getList();
    int insert(Admin admin);
    int delete(int id);
}
