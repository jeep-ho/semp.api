package com.semp.api.dao;

import com.semp.api.domain.TbsUser;

public interface TbsUserMapper {
    int deleteByPrimaryKey(String userId);

    int insert(TbsUser record);

    int insertSelective(TbsUser record);

    TbsUser selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(TbsUser record);

    int updateByPrimaryKeyWithBLOBs(TbsUser record);

    int updateByPrimaryKey(TbsUser record);
}