package com.tnsif.constructorassignment;

public class CustomerDemo {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.setCid(01);
		c1.setCname("Abi");
		c1.setCity("Cuddalore");
	    System.out.println(c1);
	    
	    Customer c2=new Customer();
	    System.out.println(c2);//default constructor
	    
	    Customer c3=new Customer(06,"Anju","Cuddalore");//invoke parameterized constructor 
	    System.out.println(c3);
	}

}
