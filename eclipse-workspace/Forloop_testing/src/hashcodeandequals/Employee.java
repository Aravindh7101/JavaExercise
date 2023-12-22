package hashcodeandequals;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
	String name;
	int id;
	public Employee(String names,int ids) {
		this.name =names;
		this.id=ids;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//set and sethash is used to romove the 
		
		Employee oneper = new Employee("Suresh",4123);
		Employee secondpers = new Employee("ramesh",4123);
		Set employes = new HashSet();
		employes.add(oneper);
		employes.add(secondpers);
		System.out.println(employes);
		
		Set s = new HashSet();
		s.add(100);
		s.add(100);
		System.out.println(s);   //set and sethash is used to romove the duplicate value

	}

	

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		if( id != other.id) 
			return false;
			return true;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}
	

}
