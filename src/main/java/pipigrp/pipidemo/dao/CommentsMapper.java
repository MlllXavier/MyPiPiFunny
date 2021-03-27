package pipigrp.pipidemo.dao;

import pipigrp.pipidemo.pojo.Comments;

public interface CommentsMapper {
    int deleteByPrimaryKey(Integer idComment);

    int insert(Comments record);

    int insertSelective(Comments record);

    Comments selectByPrimaryKey(Integer idComment);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);
}