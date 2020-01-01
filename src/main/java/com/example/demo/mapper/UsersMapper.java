package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;



@Mapper
public interface UsersMapper {
public int login (User user);
}
