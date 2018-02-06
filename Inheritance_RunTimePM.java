package com.pack;

public class Inheritance_RunTimePM {

	public static void main(String[] args) {
		System.out.println("insdie main method");
		Inheritance_RunTimePM obj = new Inheritance_RunTimePM(); 
		obj.m2();
		Inheritance_RunTimePM obj1 = new B();
		obj1.m2();
		B obj2 = new B();
		obj2.m3();
		B obj3 = new C();
		obj3.m3();
	}
	
	void m1() {
		System.out.println("Class Inheritance_RunTimePM method m1");
	}
	void m2() {
		System.out.println("class Inheritance_RunTimePM method m2");
	}
}

class B extends Inheritance_RunTimePM { // inheritance
	void m2() {
		System.out.println("class B method m2");
	}
	
	void m3() {
		System.out.println("class B method m3");
	}
}


class C extends B { // inheritance
	void m4() {
		System.out.println("class C method m4");
	}
	void m3() {
		System.out.println("Class C method m3");
	}
}