package findNnumbers;

import java.util.Scanner;

public class Nnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 10;
		int n = 0;
		for (int i = 1; i <= value; i++) {
			n = n + i;
		}
		System.out.println("sum of n number " + n);
		
		Nnumber number =new Nnumber();
		number.whileadd();
		number.dowhileadd();
		number.scanner();

	}

	public void whileadd() {
		int i =0;
		int value =1;
		int n =10;
		while(value<=n) {
			i = i+value;
			value++;
		}
		System.out.println("sum of number in while "+i);

	}
	public void dowhileadd() {
		int zero =0;
		int k =1;
		int value =10;
		do {
			zero=zero+k;
			k++;
		}while(k<=value);
		System.out.println("sum of n number in do while "+zero);
	}
	
	public void scanner() {
		int k =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the N number in below");
		int op = input.nextInt();
		System.out.println("Enter the N number " + op);
		for(int i=1;i<=op;i++) {
			k=k+i;
		}
		System.out.println("Scanner using find N number "+k);
	}
}
