package com.tnsif.inheritanceexample;

public class Teacher extends Person{
     private int id;
     private String Destination;
     private String Session;
	 public Teacher(String Name,int Age,String City,int id, String destination, String session) {
		super(Name,Age,City);
		this.id = id;
		Destination = destination;
		Session = session;
	}
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id = id;
	 }
	 public String getDestination() {
		 return Destination;
	 }
	 public void setDestination(String destination) {
		 Destination = destination;
	 }
	 public String getSession() {
		 return Session;
	 }
	 public void setSession(String session) {
		 Session = session;
	 }
	 @Override
	 public String toString() {
		return "Teacher [Name=" + super.getName() + ", Age=" + super.getAge() + ", City=" + super.getCity() + "id=" + id + ", Designation=" + Destination + ", Session=" + Session + "]";
	 }
}