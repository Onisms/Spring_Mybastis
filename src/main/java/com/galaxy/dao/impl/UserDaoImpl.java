package com.galaxy.dao.impl;

import com.galaxy.bean.User;
import com.galaxy.dao.UserDao;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    //从spring的核心配置文件中获取sqlSessionFactory的对象，并进行注入操作
    @Override
    @Resource(name = "sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public User queryById(Integer id) {
        User user = this.getSqlSession().selectOne("queryById", id);
        return user;
    }

    @Override
    public int insert(User user) {
        this.getSqlSession().insert("insert", user);
        return 0;
    }
}
