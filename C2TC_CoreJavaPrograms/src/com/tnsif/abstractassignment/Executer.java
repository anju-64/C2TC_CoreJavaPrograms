package com.tnsif.abstractassignment;

public class Executer {

	public static void main(String[] args) {
		Shopping s=new FoodCourt();
		s.buy();
        s.mall();
        
		Shopping s1=new Electronics();
		s1.buy();
	}

}
