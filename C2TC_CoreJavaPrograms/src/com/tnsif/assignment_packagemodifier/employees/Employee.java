package com.tnsif.assignment_packagemodifier.employees;

public class Employee {
     private String name;
     private int employeeid;
     private int salary;
	 public Employee(String name, int employeeid, int salary) 
	{
		this.name = name;
		this.employeeid = employeeid;
		this.salary = salary;
	}
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public int getEmployeeid() {
		 return employeeid;
	 }
	 public void setEmployeeid(int employeeid) {
		 this.employeeid = employeeid;
	 }
	 public int getSalary() {
		 return salary;
	 }
	 public void setSalary(int salary) {
		 this.salary = salary;
	 }
	 @Override
	 public String toString() {
		return "Employee [name=" + name + ", employeeid=" + employeeid + ", salary=" + salary + "]";
	 }
}
