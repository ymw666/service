package com.example.demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Music;
import com.example.demo.service.MusicService;

@RestController
@RequestMapping("/Music")
public class MusicController {
	@Autowired
	MusicService musicService;
	
	@RequestMapping("/gitlist")
	public List<Music> getlist(){
		return musicService.getMusicList();
		
	}
}
