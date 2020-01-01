package com.example.demo.model;

public class Music {
private Integer mId;
private String MusicName;
private String Singer;
public int getmId() {
	return mId;
}
public void setmId(int mid) {
	mId = mid;
}
public String getMusicName() {
	return MusicName;
}
public void setMusicName(String musicName) {
	MusicName = musicName;
}
public String getSinger() {
	return Singer;
}
public void setSinger(String singer) {
	Singer = singer;
}
@Override
public String toString() {
	return "Music [Mid=" + mId + ", MusicName=" + MusicName + ", Singer=" + Singer + "]";
}

}
