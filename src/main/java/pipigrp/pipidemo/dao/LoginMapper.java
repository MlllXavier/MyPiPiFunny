package pipigrp.pipidemo.dao;

import pipigrp.pipidemo.pojo.Login;

public interface LoginMapper {
    int deleteByPrimaryKey(String ppId);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(String ppId);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}