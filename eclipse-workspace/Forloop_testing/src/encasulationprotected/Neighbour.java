package encasulationprotected;

public class Neighbour {
	public static void main(String []args) {
		Owner fruit = new Owner();
		fruit.fruit();
		fruit.apple();
		int values = fruit.seed;
		System.out.println("FRUIT VALUE " + values);

    }
	
}
