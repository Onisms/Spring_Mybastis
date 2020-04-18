package com.galaxy.test;

import com.galaxy.bean.User;
import com.galaxy.dao.UserDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testUser {
    @Test
    public void user(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) context.getBean("userDaoImpl");
        User user = userDao.queryById(6);
        System.out.println(user);
    }
    @Test
    public void insert(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserDao userDao = (UserDao) context.getBean("userDaoImpl");
        User user = new User();
        user.setName("aaa");
        user.setAge(11);
        user.setSex("女");
        userDao.insert(user);
    }
}