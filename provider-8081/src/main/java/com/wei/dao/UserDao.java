package com.wei.dao;

import com.wei.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 为为
 * @create 6/16
 */
@Mapper
public interface UserDao {

    boolean addUser(User user);
    boolean updateUser(User user);
    boolean delUserById(String id);
    List<User> getList();
    User getUserById(String id);
}