package com.example.demo.controller;

import javax.xml.ws.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CommentService;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@RestController
@RequestMapping("/comment")
public class CommentController {
	@Autowired
	CommentService commentService;
	@RequestMapping("/comment")
	public ResponseEntity<Response> createComment(Id userId){
		try {
			CommentService.class.getClass();
		} catch (Exception e) {
			// TODO: handle exception
			return createComment(userId);
		} if (commentService==null) {
			commentService.comment();
		}else {
			commentService.comment();
		}
		return null;
		
	}
	}

