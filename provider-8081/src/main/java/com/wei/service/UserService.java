package com.wei.service;

import com.wei.dao.UserDao;
import com.wei.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 为为
 * @create 6/16
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public boolean add(User user) {
        return userDao.addUser(user);
    }
    public boolean update(User user) {
        return userDao.updateUser(user);
    }

    public boolean delete(String id) {
        return userDao.delUserById(id);
    }

    public List<User> list() {
        return userDao.getList();
    }

    public User get(String id) {
        return userDao.getUserById(id);
    }

}