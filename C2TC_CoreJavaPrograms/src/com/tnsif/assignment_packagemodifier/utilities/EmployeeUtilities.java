package com.tnsif.assignment_packagemodifier.utilities;

import com.tnsif.assignment_packagemodifier.employees.*;


public class EmployeeUtilities {

    public String getManagerInfo(Manager m) {
        return "Manager [name=" + m.getName() + ", employeeid=" + m.getEmployeeid() +
               ", salary=" + m.getSalary() + ", company=" + m.getCompany() +
               ", experience=" + m.getExperience() + "]";
    }

    public String getDeveloperInfo(Developer d) {
        return "Developer [name=" + d.getName() + ", employeeid=" + d.getEmployeeid() +
               ", salary=" + d.getSalary() + ", lang=" + d.getBranch() +
               ", yearsinposition=" + d.getAge() + "]";
    }
}
