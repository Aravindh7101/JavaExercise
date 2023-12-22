package hierarchicalinheritance;

import singleinheritance.Father;

public class Daughter extends Father {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//same panrent - multiple child class 
		Daughter daughobj = new Daughter();
		daughobj.act();
		daughobj.open();
		daughobj.Saving();
 
	}
	
	protected void Saving() {
		System.out.println(" open saving account");
	}
	
	protected void sing() {
		System.out.println("female singing");
	}

}
