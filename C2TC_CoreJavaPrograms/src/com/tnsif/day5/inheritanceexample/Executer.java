package com.tnsif.day5.inheritanceexample;

public class Executer {

	public static void main(String[] args) {
		Student s1=new Student();
		
		s1.setCollegeName("IFET");
		s1.setCourse("CoreJava");
		s1.setLocation("Villupuram");
        s1.setSid(06);
        s1.setSname("Anjuga");
        
        System.out.println(s1);
        
        Student s2=new Student();
        System.out.println(s2);
        
        Student s3=new Student("IFET","Villupuram",13,"Bhuvana","CoreJava");
        System.out.println(s3);
	}

}
