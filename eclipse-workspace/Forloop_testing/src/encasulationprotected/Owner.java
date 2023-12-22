package encasulationprotected;

public class Owner {

	public static void main(String[] args) {

		Owner veg = new Owner();
		veg.vegetable();
	}

	protected int seed = 10;

	protected void fruit() {
		System.out.println("This is fruit class");
	}

	private void vegetable() {
		System.out.println(" this is vegrtable class");
	}
	
	protected void apple() {
		System.out.println("this is protect apple class ");
	}
 
}
