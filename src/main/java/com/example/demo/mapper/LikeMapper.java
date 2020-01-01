package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Like;

@Mapper
public interface LikeMapper {
	public int like(Like like );
}
