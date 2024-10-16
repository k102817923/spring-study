package com.spring.mapper;

import com.spring.pojo.Admin;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AdminMapperTest {
//    @Test
//    public void getList() throws IOException {
//        String resource = "mybatis-config.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        AdminMapper adminMapper = sqlSession.getMapper(AdminMapper.class);
//
//        List<Admin> adminList = adminMapper.getList();
//        for (Admin admin : adminList) {
//            System.out.println(admin);
//        }
//
//        sqlSession.close();
//    }

    @Test
    public void getListByMybatisSpring() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AdminMapper adminMapper = (AdminMapper) context.getBean("adminMapperImpl");
        List<Admin> adminList = adminMapper.getList();
        for (Admin admin : adminList) {
            System.out.println(admin);
        }
    }
}
