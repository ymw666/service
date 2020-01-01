package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Personal;

@RestController
@RequestMapping("/music")
public class PersonalController {
	@Autowired
	Personal personal;
	@RequestMapping("/personal")
	public int personal (Personal personal) {
		return 0;
	}
}
