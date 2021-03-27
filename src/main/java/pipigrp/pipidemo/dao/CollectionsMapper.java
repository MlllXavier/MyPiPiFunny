package pipigrp.pipidemo.dao;

import pipigrp.pipidemo.pojo.Collections;

public interface CollectionsMapper {
    int deleteByPrimaryKey(String idCollection);

    int insert(Collections record);

    int insertSelective(Collections record);

    Collections selectByPrimaryKey(String idCollection);

    int updateByPrimaryKeySelective(Collections record);

    int updateByPrimaryKey(Collections record);
}