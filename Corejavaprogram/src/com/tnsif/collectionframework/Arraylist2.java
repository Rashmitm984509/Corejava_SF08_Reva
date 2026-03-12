package com.tnsif.collectionframework;

import java.util.ArrayList;
import java.util.List;

public class Arraylist2 {
public static void main(String[] args) {
	List <Integer> al=new ArrayList<>();
	for(int i=1;i<=5;i++)
		al.add(i);
	System.out.println(al);
	System.out.println(al.remove(3));
	al.addFirst(6);
	System.out.println(al);
}
}
