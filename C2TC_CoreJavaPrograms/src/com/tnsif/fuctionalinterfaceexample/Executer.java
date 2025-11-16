package com.tnsif.fuctionalinterfaceexample;

public class Executer {

	public static void main(String[]args)
	{
		/*
		 * Calculate c1=new Calculate() { public void calculateTesting(int a, int b) {
		 * System.out.println("Addition:" + (a+b)); }
		 * 
		 * };
		 * 
		 * c1.calculateTesting(10, 20);
		 * 
		 * Calculate c2=new Calculate() { public void calculateTesting(int a, int b) {
		 * System.out.println("Subtraction:" + (a-b));
		 * 
		 * }
		 * 
		 * }; c2.calculateTesting(25,37);
		 * 
		 * //Lambda Expression Calculate c3=(n,m)->{System.out.println("Multiplication:"
		 * + n*m);};
		 * 
		 * c3.calculateTesting(7, 3);
		 * 
		 * Calculate c4=(n,m)->{System.out.println("Division:" + n/m);};
		 * 
		 * c4.calculateTesting(8, 2);
		 */
		Message m1=(n)->{System.out.println("Enter Greetings: "+n);};
		m1.greetings("Welcome");
				 
	}
}
