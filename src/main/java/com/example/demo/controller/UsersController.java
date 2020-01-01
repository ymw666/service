package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;

import com.example.demo.service.UsersService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/users")
public class UsersController {

@Autowired
UsersService usersService;

@RequestMapping("/login")
	public JSONObject login(User user) {
	JSONObject result = new JSONObject();
	int i=usersService.login(user);
	result.put("state", i);
	return result;
}


}
