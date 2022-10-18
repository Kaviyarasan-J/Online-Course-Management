package com.courses.Model;
public class Course {
      private String course;
      private int fee;
	  private String url;
	public Course(String course, int fee, String url) {
		this.course = course;
		this.fee = fee;
		this.url = url;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
