package com.tnsif.exceptionhandlingedemo;

public class throwsdemo {
static void divide(int a,int b)throws ArithmeticException{
	int result=a/b;
	System.out.println(result);
}
public static void main(String[] args) {
	divide(6,2);
}
}
