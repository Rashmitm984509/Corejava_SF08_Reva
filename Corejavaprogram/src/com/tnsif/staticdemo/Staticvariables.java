package com.tnsif.staticdemo;

class User1{
	String name;
	int EID;
	static String collegename="ITI";
	
	User1(String n, int e){
		name=n;
		EID=e;
	}
	void display() {
		System.out.println(name+" "+EID+" "+collegename);
	}
}

public class Staticvariables {
public static void main(String[] args) {
	User1 u1=new User1("rashmi",2);
	User1 u2=new User1("sashmi",4);
	User1 u3=new User1("uashmi",7);
	
	u1.display();
	u2.display();
	u3.display();
}
}
