package finalkeyword;

public class FinalObj extends Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalObj newobj = new FinalObj();
		newobj.play();
		newobj.sing();
		//newobj.fixedvalue =10;  // final variable value canot be changed 
		int value=newobj.fixedvalue;
		System.out.println("final value is ="+value);
	}

	// same method name cannot created
	/*
	 * void play() {
	 * 
	 * }
	 */

	/*
	 * ==final===keyword
	 * 
	 * 1)Final key word cannot be changed varible ex... |||| Class one { |||| Class
	 * another extets one{ class myobj =new class final int keyvalue =10; |||
	 * myobj.keyvalue = 10;//this cannot be changed value only used in syso
	 * 
	 * }
	 * 
	 * 2)final method cannot be overridden final public void play(){} ex... in
	 * another class we cannot create play same method name
	 * 
	 * 3)Final class cannot be inheritance
	 * 
	 * public final class Vijay(){}
	 */
}
