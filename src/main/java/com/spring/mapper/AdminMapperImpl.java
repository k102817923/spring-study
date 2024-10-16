package com.spring.mapper;

import com.spring.pojo.Admin;
import lombok.Setter;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//@Setter
//public class AdminMapperImpl implements AdminMapper {
//     private SqlSessionTemplate sqlSessionTemplate;
//
//    @Override
//    public List<Admin> getList() {
//        AdminMapper adminMapper = sqlSessionTemplate.getMapper(AdminMapper.class);
//        return adminMapper.getList();
//    }
//}


public class AdminMapperImpl extends SqlSessionDaoSupport implements AdminMapper {

    @Override
    public List<Admin> getList() {
//        SqlSession sqlSession = getSqlSession();
//        AdminMapper adminMapper = sqlSession.getMapper(AdminMapper.class);
//        return adminMapper.getList();

//        return getSqlSession().getMapper(AdminMapper.class).getList();

        Admin admin = new Admin(2, "李四", "123");
        AdminMapper adminMapper = getSqlSession().getMapper(AdminMapper.class);
        adminMapper.insert(admin);
        adminMapper.delete(2);

        return adminMapper.getList();
    }

    @Override
    public int insert(Admin admin) {
        return getSqlSession().getMapper(AdminMapper.class).insert(admin);
    }

    @Override
    public int delete(int id) {
        return getSqlSession().getMapper(AdminMapper.class).delete(id);
    }
}