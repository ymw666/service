package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Personal;

@Mapper
public interface PersonalMapper {
	public int personal (Personal personal);
}
