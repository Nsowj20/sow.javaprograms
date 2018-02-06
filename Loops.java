package com.pack;

public class Loops {
	int a = 5;
	String b = "sowjanya";
	String[] d  = new String[10];
	
	public static void main(String[] args) {
		Loops obj= new Loops();
		System.out.println(obj.a = 10);
		System.out.println(obj.b = "sow");
		
		
		int[] n = new int[5];
		n[0] = 545;
		n[1] = 74;
		n[2] = 54; // populating values into array
		n[3] = 788;
		n[4] = 465;
		
		for(int i = 0; i<n.length; i++)
		{
			System.out.println(n[i]);
		}
		
		
		Loops u = new Loops();
		u.d[0] = "abc";
		u.d[1] = "def";
		u.d[2] = "ghi";
		u.d[3] = "jkl";	// populating values into string
		u.d[4] = "mno";
		u.d[5] = "pqr";
		u.d[6] = "stu";
		u.d[7] = "vw";
		u.d[8] = "xyz";

			System.out.println(u.d[5]);	
			System.out.println(u.d[3]);
			System.out.println(u.d[7]);
			
		Loops L = new Loops();
		L.ifelse();
	}
	
	
void ifelse() {
	int v =56;
	int y = 8;
	int r = 66;
	if(y == r) {
		System.out.println("y, r are equal"); 
	}
	else {
		System.out.println("y, r are not equal");
		
		
	}
}
}
