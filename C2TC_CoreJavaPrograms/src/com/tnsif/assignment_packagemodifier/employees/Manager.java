package com.tnsif.assignment_packagemodifier.employees;

public class Manager extends Employee{
     private int Experience;
     private String Company;
	 public Manager(String name, int employeeid, int salary, int experience, String company)
	{
		super(name, employeeid, salary);
		Experience = experience;
		Company = company;
	}
	 public int getExperience() {
		 return Experience;
	 }
	 public void setExperience(int experience) {
		 Experience = experience;
	 }
	 public String getCompany() {
		 return Company;
	 }
	 public void setCompany(String company) {
		 Company = company;
	 }
	 @Override
	 public String toString() {
		return "Manager [Experience=" + Experience + ", Company=" + Company + "]";
	 }
}
