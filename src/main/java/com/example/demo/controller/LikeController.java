package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Like;

@RestController
@RequestMapping("/like")
public class LikeController {
	@Autowired
	Like like;
	@RequestMapping("/like")
	public int like (Like like) {
		return 0;
	}
}
