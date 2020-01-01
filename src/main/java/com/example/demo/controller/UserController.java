package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SysUser;
import com.example.demo.service.UserService;

import net.sf.json.JSONObject;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@RequestMapping("/register")
	public JSONObject register(SysUser user) {
		JSONObject result = new JSONObject();
		int i=userService.register(user);
		result.put("state", i);
		return result;
	}
}
