package pipigrp.pipidemo.dao;

import pipigrp.pipidemo.pojo.Follow;

public interface FollowMapper {
    int deleteByPrimaryKey(String idFollow);

    int insert(Follow record);

    int insertSelective(Follow record);

    Follow selectByPrimaryKey(String idFollow);

    int updateByPrimaryKeySelective(Follow record);

    int updateByPrimaryKey(Follow record);
}