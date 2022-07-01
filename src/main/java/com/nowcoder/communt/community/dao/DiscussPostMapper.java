package com.nowcoder.communt.community.dao;

import com.nowcoder.communt.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
//    根据用户id查询帖子，使用offset和limit实现分页
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);
//    @Param注解用于给参数取别名。如果只有一个参数，并且<if>里使用，则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
