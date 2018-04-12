package com.package1;

public final class MyImmutableClass {

	private final int studentId;                       
	private final String studentName;
	private final int marks;
	private final StudentAgeClass age;

	public MyImmutableClass(int studentId, String studentName, int marks, StudentAgeClass age) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		StudentAgeClass cloneit = new StudentAgeClass();
		cloneit.setYear(age.getYear());
		this.age = cloneit;
	}
	
	public int getStudentId() {               
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	
	public int getMarks() {
		return marks;
	}

	public StudentAgeClass getAge() {
		StudentAgeClass cloneAge = new StudentAgeClass();
		    cloneAge.setYear(this.age.getYear());
		    return cloneAge;
	}
	
	public static void main(String[] args) {
		
		StudentAgeClass obj = new StudentAgeClass();
		obj.setYear(1992);

		MyImmutableClass obj1 = new MyImmutableClass(94, "sow", 75, obj);
		System.out.println(obj1);
		  System.out.println("year before modification = " + obj1.getAge().getYear());
		    obj1.getAge().setYear(1992);
		    System.out.println("year after modification = " + obj1.getAge().getYear());
	}
}