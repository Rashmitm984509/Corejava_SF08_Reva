package com.tnsif.interfacedemo;
// demo for interface

interface SmartDevice{
	void turnon();
	  void turnoff() ;
	  void getstatus();
	  }

class Smartlight implements SmartDevice{

	@Override
	public void turnon() {
		System.out.println("smart light on");
	}

	@Override
	public void turnoff() {
		System.out.println("smart light off");
	}

	@Override
	public void getstatus() {
		System.out.println("smart light is in standby mode");	
	}
	
}

public interface Interfacedemo {
	public static void main(String[] args) {
		SmartDevice s=new Smartlight();
		s.getstatus();
		s.turnoff();
		s.turnon();
	}

}
