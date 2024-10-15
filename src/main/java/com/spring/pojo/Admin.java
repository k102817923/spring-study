package com.spring.pojo;

public class Admin {
    private int id;
    private String name;
    private String pwd;

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
