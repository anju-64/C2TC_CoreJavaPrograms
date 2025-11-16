package com.tnsif.entityassignment;

public class ProductDemo {
	    public static void main(String[] agrs)
	    {
	    	Product p1=new Product();
	    	
	    	p1.setPrice(10);
	    	p1.setPname("IceCream");
	    	
	    	System.out.println(p1);
	    	
	    	Product p2=new Product();
	    	
	    	p2.setPrice(5);
	    	p2.setPname("Brownie");
	    	
	    	System.out.println(p2);
	    	
	    	Product p3=new Product();
	    	
	    	p3.setPrice(6);
	    	p3.setPname("PanCake");
	    	
	    	System.out.println(p3);
	    }
	}