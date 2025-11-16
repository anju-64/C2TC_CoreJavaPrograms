package com.tnsif.day6.staticexamples;

public class StaticDemo 
{
	static void main()
	{
		System.out.println("main program 1...");
	}
	public static void main(char n)
	{
		System.out.println("main program 2...");
	}
	public static void main(String args)
	{
		System.out.println("main program 3...");
	}
	public static void main(String[]args)
	{
		System.out.println("main program 4...");
	}
	//instance block
	{
		System.out.println("instance block");
	}
	//static block
	static
	{
		System.out.println("welcome to static block");
	}
    static
    {
    	System.out.println("static block");
    }
}
