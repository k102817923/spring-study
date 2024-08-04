package com.spring.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    @Test
    public void myTest() {
        // 获取 Spring 上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 对象都在 Spring 容器中
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
