package com.pack;

public class ConstructorOL {
	
	ConstructorOL(){
		System.out.println("inside zero argument constructor");
	}
	ConstructorOL(int a, String s){
		System.out.println("insdie two argument constructor");
		
	}
	ConstructorOL (String s, int a) {
		System.out.println("insdie two argument constructor");
		// the datatypes are also same but declaration order does count
	}
	ConstructorOL (float f) {
		System.out.println("insdie one argument constructor");
	}

	public static void main(String[] args) {
		 new ConstructorOL(75, "java");
		
		 new ConstructorOL(75754);

	}

}
