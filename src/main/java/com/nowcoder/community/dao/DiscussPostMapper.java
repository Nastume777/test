package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Nastume
 * @create 2023-03-16 16:21
 */
@Mapper
public interface DiscussPostMapper {
    /**
     * @param userId 考虑查看我的帖子的情况下设置动态sql，看mapper就知道了
     * @param offset 起始的行号
     * @param limit  每页的条数
     * @return
     */
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //如果需要动态拼接条件（<if>里使用）并且这个方法有且只有一个参数需要用@Param起别名
    //@Param用于给参数取别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
