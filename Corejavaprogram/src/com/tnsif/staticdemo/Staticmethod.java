package com.tnsif.staticdemo;

class student{
	int rollno=9;
	String name;
	static String collegename="ITI";
	
	
	static void change() {
		collegename="Reva";
		//rollno=7;
	}
	student(int r,String s){
		rollno=r;
		name=s;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+collegename);
	}
}

public class Staticmethod {
	public static void main(String[] args) {
		student.change();
	
student s1=new student(1,"rash");
student s2=new student(6,"sash");
student s3=new student(9,"uash");
s1.display();
s2.display();
s3.display();


}
}