package com.coursehistory.Model;

public class CourseHistory {
    private int listid;
    private int id;
    private String uname;
    private String course;
    private int fee;
	public CourseHistory(int listid, int id, String uname, String course, int fee) {
		this.listid = listid;
		this.id = id;
		this.uname = uname;
		this.course = course;
		this.fee = fee;
	}
	public CourseHistory(int id, String uname, String course, int fee) {
		this.id = id;
		this.uname = uname;
		this.course = course;
		this.fee = fee;
	}
	public int getListid() {
		return listid;
	}
	public void setListid(int listid) {
		this.listid = listid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
    
}
