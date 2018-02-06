package com.pack;

public class MethodOL { // method over loading

	public static void main(String[] args) {
		MethodOL obj = new MethodOL();
		obj.add(5);
		obj.add(45, 78);
		obj.add(45, "gfz");
		obj.add("abc", 96);


	}
	int add(int a) {
		System.out.println("inside 1 argument method");
		System.out.println(a);
		return 44; 
		}
	
	int add(int a, int b) {
		System.out.println("inside 2 argument method");
		System.out.println(a+b);
		return a+b;

	}
	
	void add(String p, int e) {
		System.out.println("two argument void method");
	}
	
	void add(int e,String p) {
		System.out.println("two argument void method");
	}
	
	
}
