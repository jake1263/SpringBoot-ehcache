package com.irish.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.irish.entity.Users;

public interface UserMapper {
	
	@Select("SELECT ID ,NAME,AGE FROM users where id=#{id}")
	List<Users> getUser(@Param("id") Long id);
}
