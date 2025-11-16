package com.tnsif.entityassignment;

public class Product {
	    private int price;
	    private String pname;
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		@Override
		public String toString() {
			return "Product [price=" + price + ", pname=" + pname + "]";
		}
		
}
