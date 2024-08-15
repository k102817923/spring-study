package com.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.swing.*;

// 等价于 <bean id="user" class="当前类"/>
@Component("user")
// 作用域，默认 singleton 单例模式，关闭工厂，所有的对象都会被销毁
// prototype 多例模式，关闭工厂，所有的对象不会被销毁，由内部 GC 处理
@Scope("singleton")
public class User {
    // 使用注解注入属性，可以无需 set() 方法
    // 等价于配置文件中 <property name="name" value="xxx"/>
    // 如果提供 set() 方法，也可以在 set() 方法上添加 @value()
    @Value("属性注入")
    private String name;
    // Resource 和 Autowired 都是用于自动装配，且都可以放在属性字段上
    // Autowired 通过 byName 的方式实现，常用
    // Resource 默认通过 byName 的方式实现，如果找不到名字，则通过 byType 的方式实现，如果两种方式都找不到，则报错
//    @Resource
    // 如果显示定义了 required = false，说明这个对象可以为 null，否则不允许为空
//    @Autowired(required = false)
    private Cat cat;
//    @Autowired
    // 标记这个字段可以为 null
//    @Nullable
    // 如果 Autowired 自动装配的环境比较复杂，自动装配无法通过一个注解完成时，可以使用 Qualifier 指定一个唯一的 bean 对象注入
//    @Qualifier(value = "dog2")
    private Dog dog;

//    public User() {
//        System.out.println("User 无参构造");
//    }

//    public User(String name) {
//        this.name = name;
//    }


    public String getName() {
        return name;
    }

//    使用 Autowired 后可以不用编写 set() 方法了，但前提是这个自动装配的属性在 IOC（Spring）容器中存在，且符合 byName 规则
//    public void setName(String name) {
//        this.name = name;
//    }

    public Cat getCat() {
        return cat;
    }

//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                ", dog=" + dog +
                '}';
    }
}
