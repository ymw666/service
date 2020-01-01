package com.example.demo.servicelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.MusicMapper;
import com.example.demo.model.Music;
import com.example.demo.service.MusicService;

@Service
public class MusicServicelmpl implements MusicService{

	@Autowired
	MusicMapper musicMapper;
	
	@Override
	public List<Music> getMusicList() {
		// TODO Auto-generated method stub
		return null;
	}

}
