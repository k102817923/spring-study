package com.spring.service;

import org.junit.Test;

public class ProxyInvocationHandlerTest {
    @Test
    public void myTest() {
        // 代理模式（动态代理）
        // 真实角色
        Host host = new Host();
        // 代理角色：不存在
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        // 设置要代理的对象
        proxyInvocationHandler.setTarget(host);
        // 动态生成代理类
        Rent rent = (Rent) proxyInvocationHandler.getProxy();
        rent.rent();
    }
}
