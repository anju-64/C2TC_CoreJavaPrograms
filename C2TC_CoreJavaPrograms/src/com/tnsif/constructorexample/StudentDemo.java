package com.tnsif.constructorexample;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.setSid(101);
		s1.setSname("Anju");
		System.out.println(s1);
		System.out.println(s2);
		Student s3=new Student(77,"BTS");//invoke the parameterized constructor
		System.out.println(s3);
	}

}
