
public class Constructors {
	
	Constructors() {
		System.out.println("inside default or no argument constructor");
		
	}
	Constructors(int x) {
		System.out.println("inside one argument constructor");
	}
	Constructors(int y, int z) {
		System.out.println("inside two argument constructor");
	}
	
	int add(int a, int b) {
		System.out.println("inside add method of Constructors class");
		return a+b;
		
	}
}

