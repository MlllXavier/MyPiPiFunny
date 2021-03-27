package pipigrp.pipidemo.dao;

import pipigrp.pipidemo.pojo.Invitation;

public interface InvitationMapper {
    int deleteByPrimaryKey(String id);

    int insert(Invitation record);

    int insertSelective(Invitation record);

    Invitation selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Invitation record);

    int updateByPrimaryKey(Invitation record);
}