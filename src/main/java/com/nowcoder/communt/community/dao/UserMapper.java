package com.nowcoder.communt.community.dao;

import com.nowcoder.communt.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
//    查找用户的方法，返回User对象
    User selectById(int id);
    User selectByName(String name);
    User selectByEmail(String email);
//    插入用户的方法，返回被影响的行数
    int insertUser(User user);
//    更新用户状态的方法，返回被影响的行数
    int updateStatus(int id,int status);
//    更新用户头像的方法，返回被影响的行数
    int updateHeader(int id,String headerUrl);
//    更新用户密码的方法，返回被影响的行数
    int updatePassword(int id,String password);

}
