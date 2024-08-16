package com.spring.config;

import com.spring.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 表示这是一个配置类
@Configuration
// 导入合并其他配置类，类似于配置文件中的 include 标签
@Import(DogConfig2.class)
public class DogConfig {
    // 通过方法注册一个 Bean，返回值就是 Bean 的类型，方法名就是 Bean 的 ID
    @Bean
    public Dog dog() {
        return new Dog();
    }
}
