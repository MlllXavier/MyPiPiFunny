package pipigrp.pipidemo.dao;

import pipigrp.pipidemo.pojo.Userinfo;

public interface UserinfoMapper {
    int deleteByPrimaryKey(String ppId);

    int insert(Userinfo record);

    int insertSelective(Userinfo record);

    Userinfo selectByPrimaryKey(String ppId);

    int updateByPrimaryKeySelective(Userinfo record);

    int updateByPrimaryKey(Userinfo record);
}