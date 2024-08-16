package com.spring.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// JavaConfig 通过 Java 类的方式提供 Bean 的定义信息
// 将这个类标记为 Spring 的一个组件，放到容器中
@Component
public class Dog {
    @Value("dog")
    private String name;

    public void shout() {
        System.out.println("wang~");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
