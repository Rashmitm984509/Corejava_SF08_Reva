package com.tnsif.interfacedemo;

public class Childdemo implements Interfaceone,Interfacetwo {

	@Override
	public void show() {
		System.out.println("welcome to python");
		
	}

	@Override
	public void print() {
		System.out.println("welcome to java");
	}
	public static void main(String[] args) {
		Childdemo c=new Childdemo();
		c.show();
		c.print();
	}

}
