package com.example.demo.servicelmpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.CommentMapper;
import com.example.demo.model.CommentAdd;

import com.example.demo.service.CommentService;


@Service
public class CommentServicelmpl implements CommentService {
	@Autowired
	CommentMapper commentMapper;

	@Override
	public void comment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int comment(CommentAdd commentAdd) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
