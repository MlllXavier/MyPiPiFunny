package pipigrp.pipidemo.dao;

import pipigrp.pipidemo.pojo.Likes;

public interface LikesMapper {
    int deleteByPrimaryKey(String idLike);

    int insert(Likes record);

    int insertSelective(Likes record);

    Likes selectByPrimaryKey(String idLike);

    int updateByPrimaryKeySelective(Likes record);

    int updateByPrimaryKey(Likes record);
}