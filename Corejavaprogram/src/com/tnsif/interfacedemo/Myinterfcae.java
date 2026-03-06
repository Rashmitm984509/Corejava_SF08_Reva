package com.tnsif.interfacedemo;
// demo for nested interface

public interface Myinterfcae {
	void calculateArea();
	
	interface Myinnerinterface{
		int id=45;
		void print();
	}
}
