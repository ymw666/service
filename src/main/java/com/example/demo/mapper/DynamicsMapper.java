package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Dynamics;

@Mapper
public interface DynamicsMapper {
	public int dynamics (Dynamics dynamics);
}
