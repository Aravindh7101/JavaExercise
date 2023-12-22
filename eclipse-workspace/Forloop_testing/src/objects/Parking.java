package objects;

public class Parking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class - collection of object
		//object means --- combination of state and behavior
		
		Parking swift =new Parking();
		Parking audii =new Parking();
		
		
		  
		        swift.red();     //this is method calling 
		        int greentotal =audii.green();   // return value stored in greentotal 
		        //this is method calling 
		        swift.orange();
		      // |
		      // |
		      // .
		    //Method calling 
		        System.out.println(greentotal);

	}
	
	private void orange() {    ///void means empty it doesnot return any value 
		// TODO Auto-generated method stub
		// Method defination
				// Method defination shoud be in main method outside 
				// Method shoud be in inside the class 
		
		int a=10;
		int b=50;
		int c=a+b;
		System.out.println(" c value is "+ c);
			}
		
	

	private void red() {  //Method signature
		
		// Method defination
		// Method defination shoud be in main method outside 
		// Method shoud be in inside the class 
		
		System.out.println(" red color swift car added ");
	}
	private int  green() {
		
		// Method defination
				// Method defination shoud be in main method outside 
				// Method shoud be in inside the class 
		int a=10;
		int b=50;
		int total = a+b;
		   return total;
		//System.out.println(" green color audii color car added ");
		
	}

}
