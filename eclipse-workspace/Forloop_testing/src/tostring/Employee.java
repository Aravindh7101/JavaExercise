package tostring;

import java.util.ArrayList;

public class Employee {
	String name;
	int rolno;
	public Employee(String names, int rollno) {
		// TODO Auto-generated constructor stub
		this.name=names;
		this.rolno=rollno;
	} 
	
	//tosrting override
	// overriding hashcode() and equals() and tostring  METHODS IN JAVA

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n = new String("create string ");
		System.out.println(n);
		Integer i = 10;
		System.out.println(i);
		ArrayList one = new ArrayList();
		one.add("aravindh");
		System.out.println(one);
		Employee e1 = new Employee("Raja",4123);
		Employee e2 = new Employee("bala",1810);
		System.out.println(e2);
		System.out.println(e1);

	}
	public String toString() {
		return name+" "+rolno+" "+"this is object detils";
		
	}

}
