package com.tnsif.entityclass;

public class CustomerDemo {
    public static void main(String[] agrs)
    {
    	Customer c1=new Customer();
    	c1.setId(101);
    	c1.setCname("Priya");
    	c1.setCity("Chennai");
    	System.out.println(c1);
    	Customer c2=new Customer();
    	c2.setId(102);
    	c2.setCname("Kani");
    	c2.setCity("Perambalur");
    	System.out.println(c2);
    }
}
