package pipigrp.pipidemo.dao;

import pipigrp.pipidemo.pojo.History;
import pipigrp.pipidemo.pojo.HistoryKey;

public interface HistoryMapper {
    int deleteByPrimaryKey(HistoryKey key);

    int insert(History record);

    int insertSelective(History record);

    History selectByPrimaryKey(HistoryKey key);

    int updateByPrimaryKeySelective(History record);

    int updateByPrimaryKey(History record);
}