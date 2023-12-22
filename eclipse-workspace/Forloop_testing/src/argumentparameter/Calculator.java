package argumentparameter;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator casino = new Calculator();

		int addtotal = casino.add();
		              casino.subtraction(addtotal);
		//System.out.println("add total = "+addtotal);

	}

	private int add() {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println("Total value is = "+c);
		return c;

	}
	private void subtraction(int sub) {
		
		int a = sub-10;
		System.out.println("The Final Result = "+ a);
	}
}
