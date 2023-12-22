package constructoroverloading;

public class Customer {

	String name, email;
	int phone, adhar;
	
	//constructor will have the same name of the class name 
	//constructor will have not the return data type
	//this is constructor overloading - it means same constructor name with +different no of argument with different type of v 
    //constructor take it for instance value 
	//instance means == object value 
	
	public Customer(String cusname, int mobile, String Eemail, int Aadhar) {
		// TODO Auto-generated constructor stub
		name = cusname;
		email = Eemail;
		phone = mobile;
		//System.out.println("constructor checking ");

	}

	public Customer(String cusname, int mobile, String Eemail, int Aadhar, String pan) {
		// TODO Auto-generated constructor stub
		name=cusname;
		email=Eemail;
		phone = mobile;
		adhar=Aadhar;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ----constructor---- rules 1.same class name 2.public class name --void key
		 * word should not come 3. when create object the constructor called ex.. same
		 * constructor class name with different type of arguement with diffrent type of
		 * values its called constructor overloading when create constructor will call
		 * object automatically
		 * 
		 */

		Customer ajith = new Customer("ajith", 97900, "ara@12", 1424);
		Customer vishal = new Customer("vishal", 979006, "vija@123", 4251, "empde");

		ajith.appalyloan();
		vishal.open();

	}

	private void open() {
		// TODO Auto-generated method stub
		System.out.println("customer name "+ name);
		System.out.println("phone no "+ phone);
		System.out.println("adhar no "+ adhar);
		
	}

	private void appalyloan() {
		// TODO Auto-generated method stub
		System.out.println("customer name " + name);
		System.out.println("phone no "+ phone);

	}

}
