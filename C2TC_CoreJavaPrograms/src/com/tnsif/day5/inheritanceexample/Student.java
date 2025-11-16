package com.tnsif.day5.inheritanceexample;

public class Student extends College
{
      private int sid;
      private String sname;
      private String course;
      //default constructor
      public Student()
      {
    	  this.sid=01;
    	  this.sname="Abinaya";
    	  this.course="CoreJava";
      }
      //parameterized constructor
      public Student(String CollegeName,String Location,int sid,String sname,String course)
      {
    	  super(CollegeName,Location);//Calling Base Class constructor
    	  this.sid=sid;
    	  this.sname=sname;
    	  this.course=course;
      }
	  public int getSid() 
	  {
		  return sid;
	  }
	  public void setSid(int sid) 
	  {
		  this.sid = sid;
	  }
	  public String getSname() 
	  {
		  return sname;
	  }
	  public void setSname(String sname) 
	  {
		  this.sname = sname;
	  }
	  public String getCourse() 
	  {
		  return course;
	  }
	  public void setCourse(String course) 
	  {
		  this.course = course;
	  }
	  @Override
	  public String toString() 
	  {
		return "Student [sid=" + sid + ", sname=" + sname + ", course=" + course + ", CollegeName:" +super.getCollegeName()+ ", location:" + super.getLocation()+"]";
	  }
}
