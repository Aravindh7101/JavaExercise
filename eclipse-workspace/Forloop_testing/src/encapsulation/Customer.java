package encapsulation;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public
		//private
		//package
		//protected
		//above four called encapsulation 
		//private method call only within the class
		//public method call the separate package
		
		Bank newone = new Bank();
		newone.recipt();
		newone.withdrawl();
		
		System.out.println("Hi customer");

	}

}
