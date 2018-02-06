
public class MultiMethods {

	MultiMethods() {
		System.out.println("inside MultiMethods class constructor");
	}
	public static void main(String[] args) {
		System.out.println("inside main method");
		MultiMethods obj = new MultiMethods();
		System.out.println("creating object for MultiMethods class");
		obj. m1();
		obj.m2();
		System.out.println("calling m1, m2 methods in MultiMethods class with same reference var ");
		new Constructors();
		new Constructors(45);
		new Constructors(56, 46);
		System.out.println("created new objects for diff type of constructors in Constructors class ");
		Constructors obj1 = new Constructors();
		obj1.add(45, 55);
		System.out.println("calling other class(which is Constructors class) method by creating a new object (ref var is obj1)");
		}
	
	void m1() {
		System.out.println("inside m1 method");
		System.out.println("this method doesnot return anything as the return type is void");
	}
	
	int m2() {
		
		System.out.println("inside method m2");
		System.out.println("this method should return integer as method name is int");
		return 45;
		
	}
 
}
