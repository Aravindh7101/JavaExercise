package encapsulation;

public class Bank {
	private int salary = 5000;   //privvate varible declare only within the class
	
	//private method call only within the class
	//public method call the separate package
	//privvate varible declare only within the class
	public static void main(String [] args) {
		
		Bank bankdeatails = new Bank();
		bankdeatails.deposit();
		int value =bankdeatails.salary;
		System.out.println(" salary "+ value);
	}
	
	
	 
	//private object create within the class not create another class
	
	 //Bank myobj = new Bank();  //private object create within the class not create another class

	private void deposit() {
		System.out.println("deposit");
	}
	public void recipt() {
		System.out.println("recipt");
	}
	
	void withdrawl() {
		System.out.println("succesfuly withdrawl");
	}

}
