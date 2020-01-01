package com.example.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;

import com.example.demo.model.User;

import com.example.demo.service.UsersService;

@Service
public class UsersServicelmpl implements UsersService  {
	@Autowired
	UserMapper userMapper;

	@Override
	public int login(User users) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	}
	
	

