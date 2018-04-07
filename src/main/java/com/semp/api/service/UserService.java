package com.semp.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.semp.api.dao.TbsUserMapper;
import com.semp.api.domain.TbsUser;
import com.semp.api.service.impl.IUserService;

@Service
public class UserService implements IUserService {
	@Autowired
	TbsUserMapper tbsUserMapper;
	
 @Override
public TbsUser GetUserById(String userId) {
	return tbsUserMapper.selectByPrimaryKey(userId);
}
}
