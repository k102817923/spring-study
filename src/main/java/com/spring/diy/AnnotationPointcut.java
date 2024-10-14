package com.spring.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// 标注这个类是一个切面
@Aspect
// @Component 使用注解方式注册 bean，等价于在 bean.xml 中定义 bean
public class AnnotationPointcut {
    @Before("execution(* com.spring.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("========= 方法执行前 =========");
    }

    @After("execution(* com.spring.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("========= 方法执行后 =========");
    }

    // 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.spring.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名:" + joinPoint.getSignature());
        // 执行方法
        Object proceed =  joinPoint.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
