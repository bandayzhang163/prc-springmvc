package com.banday.service.impl;

import com.banday.mapper.UserMapper;
import com.banday.pojo.User;
import com.banday.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int delete(int id) {
        return userMapper.delete(id);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

    @Override
    public List<User> listUser() {
        return userMapper.listUser();
    }

    @Override
    public User getUser(int id) {
        return userMapper.getUser(id);
    }
}
