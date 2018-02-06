package com.pack;

public class OperatorOL {

	public static void main(String[] args) {
		OperatorOL obj = new OperatorOL();
		obj.concat("calling one argument string method");
		obj.concat("iam", "sow");

	}
	String concat(String s) {
		System.out.println("inside 1 argument method");
		System.out.println(s);
		return s;
	}
	String concat(String s, String a) {
		System.out.println("inside 2 argument method");
		System.out.println(s + a);
		return s+a;


	}

}
