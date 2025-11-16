package com.tnsif.assignment_packagemodifier.employees;

public class Developer extends Employee{
     private int Age;
     private String Branch;
	 public Developer(String name, int employeeid, int salary, int age, String branch)
	{
		super(name, employeeid, salary);
		Age = age;
		Branch = branch;
	}
	 public int getAge() {
		 return Age;
	 }
	 public void setAge(int age) {
		 Age = age;
	 }
	 public String getBranch() {
		 return Branch;
	 }
	 public void setBranch(String branch) {
		 Branch = branch;
	 }
	 @Override
	 public String toString() {
		return "Developer [name=" + getName() + ", employeeid=" + getEmployeeid() + ", salary=" + getSalary() + ", Age=" + Age + ", Branch=" + Branch + "]";
	 }
}
