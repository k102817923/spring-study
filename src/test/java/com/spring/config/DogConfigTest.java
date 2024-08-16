package com.spring.config;

import com.spring.pojo.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DogConfigTest {
    @Test
    public void myTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(DogConfig.class);
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog);
    }
}
