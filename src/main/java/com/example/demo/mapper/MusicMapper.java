package com.example.demo.mapper;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.Music;

@Mapper
public interface MusicMapper {
	public List<Music> selecAllMusic();
}
