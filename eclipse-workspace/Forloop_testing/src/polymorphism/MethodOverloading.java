package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Polymorpisam means same method but diffetent data type or different value 
		//it is compiletime polymorpisam for reason we know what result will shown in this method
		//Polymorpisam called --Method Overloadind and complile time polymorphism
		
		MethodOverloading sathish = new MethodOverloading();
		//MethodOverloading vijay = new MethodOverloading();
		sathish.fillform("aravindh",4123,"arav@123");
		MethodOverloading vijay = new MethodOverloading();
		//MethodOverloading vijay = new MethodOverloading();
		vijay.fillform("aravindh",4123,4125,"arav@123");  
	}

	private void fillform(String name, int phone, String email) {
		// TODO Auto-generated method stub
		
	}
	private void fillform(String name ,int no1, int no2,String email) {
		
	}
	

}
