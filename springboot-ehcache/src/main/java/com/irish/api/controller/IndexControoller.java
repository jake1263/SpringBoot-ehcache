package com.irish.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irish.entity.Users;
import com.irish.service.UserService;

@RestController
public class IndexControoller {
	@Autowired
	private UserService userService;
	
	@Autowired
	private CacheManager cacheManager;


	@RequestMapping("/remoKey")
	public void remoKey() {
		cacheManager.getCache("userCache").clear();
	}

	@RequestMapping("/getUser")
	public List<Users> getUser(Long id) {
		return userService.getUser(id);
	}


}
