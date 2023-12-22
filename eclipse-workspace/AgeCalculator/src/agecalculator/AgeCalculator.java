package agecalculator;

import java.util.*;

public class AgeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AgeCalculator adddeat = new AgeCalculator();
		adddeat.details();
		// int currrentage = adddeat.details();
		// System.out.println(currrentage);
		// adddeat.subyear(currrentage);

	}

	private void details() {

		int age = 0;
		int current = 2023;

		//for (int i = 0; i <= 5; i++) {
			Scanner name = new Scanner(System.in);
			System.out.println("Enter details");
			System.out.println("Enter Your Name");
			name.nextLine();
			System.out.println("Enter Your Date of Birth Year");
			age = name.nextInt();
			System.out.println("your age is = " + (age - current));
			name.close();
		//}

		// return age;
	}

	/*
	 * private void subyear(int year) {
	 * 
	 * int total = year - 2023;
	 * 
	 * System.out.println("Your Current Age Is = "+ total); }
	 */

}
