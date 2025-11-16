package com.tnsif.inheritanceexample;

public class Student extends Person{
     private int sid;
     private String course;
	 public Student(String Name,int Age,String City,int sid, String course) 
	 {
		super(Name,Age,City);
		this.sid = sid;
		this.course = course;
	 }
	 public int getSid() {
		 return sid;
	 }
	 public void setSid(int sid) {
		 this.sid = sid;
	 }
	 public String getCourse() {
		 return course;
	 }
	 public void setCourse(String course) {
		 this.course = course;
	 }
	 @Override
	 public String toString() {
		return "Student [Name=" + super.getName() + ", Age=" + super.getAge() + ", City=" + super.getCity() + "sid=" + sid + ", course=" + course + "]";
	 }
}