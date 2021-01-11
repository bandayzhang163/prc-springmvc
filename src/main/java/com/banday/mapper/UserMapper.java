package com.banday.mapper;

import com.banday.pojo.User;

import java.util.List;

public interface UserMapper {
    /**
     * 添加用户
     */
    int add(User user);

    /**
     * 删除用户
     */
    int delete(int id);

    /**
     * 修改用户
     */
    int update(User user);

    /**
     * 查询用户列表
     */
    List<User> listUser();

    /**
     * 查询用户详情
     */
    User getUser(int id);
}
