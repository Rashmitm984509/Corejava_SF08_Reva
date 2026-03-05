package com.tnsif.finalkeywords;
// demo for final keyword

public final class Finaldemo {
	
	 final int a=7; // cant change value
	 
	 final void display() {// override
		 System.out.println("hello world");
	 }
	
	
	public static void main(String[] args) {
		Finaldemo f=new Finaldemo();
		
	}

}
