package com.example.demo.model;

public class Dynamics {
	private String username;
	private String musicrecords;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMusicrecords() {
		return musicrecords;
	}
	public void setMusicrecords(String musicrecords) {
		this.musicrecords = musicrecords;
	}
	@Override
	public String toString() {
		return "Dynamics [username=" + username + ", musicrecords=" + musicrecords + "]";
	}
	
}
