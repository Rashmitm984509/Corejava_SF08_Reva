package com.tnsif.interfacedemo;

public class Nestedinterfcae implements Myinterfcae.Myinnerinterface{

	@Override
	public void print() {
		System.out.println("nested interfcae");
	}
public static void main(String[] args) {
	Nestedinterfcae b=new Nestedinterfcae();
	b.print();
	//System.out.println(b.id);
	System.out.println(Nestedinterfcae.id);
}
}
