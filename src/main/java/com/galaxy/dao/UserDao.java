package com.galaxy.dao;

import com.galaxy.bean.User;

public interface UserDao {
    User queryById(Integer id);

    int insert(User user);
}
