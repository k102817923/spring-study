package com.spring.service;

import org.junit.Test;

public class RentTest {
    @Test
    public void myTest() {
        // 代理模式（静态代理）
        // 抽象角色：一般会使用接口或者抽象类来解决（Rent）
        // 真实角色：被代理的角色（Host）
        // 代理角色：代理真实角色，一般会做一些附属操作（Proxy）
        // 客户：访问代理对象的人
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
