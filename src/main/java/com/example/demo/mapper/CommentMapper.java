package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.CommentAdd;

@Mapper
public interface CommentMapper {
	public int comment(CommentAdd commentAdd);
}
