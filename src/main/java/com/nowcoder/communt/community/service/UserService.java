package com.nowcoder.communt.community.service;

import com.nowcoder.communt.community.dao.UserMapper;
import com.nowcoder.communt.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id){
        return userMapper.selectById(id);
    }
}
