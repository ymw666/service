package com.example.demo.model;

public class Like {
	private String uername;
	private String musicName;
	public String getUername() {
		return uername;
	}
	public void setUername(String uername) {
		this.uername = uername;
	}
	public String getMusicName() {
		return musicName;
	}
	public void setMusicName(String musicName) {
		this.musicName = musicName;
	}
	@Override
	public String toString() {
		return "Like [uername=" + uername + ", musicName=" + musicName + "]";
	}
	
}
