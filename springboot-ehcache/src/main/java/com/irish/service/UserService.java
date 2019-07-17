package com.irish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.irish.entity.Users;
import com.irish.mapper.UserMapper;

@CacheConfig(cacheNames = "userCache")
@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	@Cacheable
	public List<Users> getUser(Long id) {
		return userMapper.getUser(id);
	}

}
