package com.example.demo.model;

import java.sql.Time;

public class CommentAdd {
	private String id;
	private String content;
	private Time createtime;
	private String userid;
	private String postid;
	private String pid;
	private String replyuserid;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Time getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Time createtime) {
		this.createtime = createtime;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPostid() {
		return postid;
	}
	public void setPostid(String postid) {
		this.postid = postid;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getReplyuserid() {
		return replyuserid;
	}
	public void setReplyuserid(String replyuserid) {
		this.replyuserid = replyuserid;
	}
	@Override
	public String toString() {
		return "CommentAdd [id=" + id + ", content=" + content + ", createtime=" + createtime + ", userid=" + userid
				+ ", postid=" + postid + ", pid=" + pid + ", replyuserid=" + replyuserid + "]";
	}
	
}
