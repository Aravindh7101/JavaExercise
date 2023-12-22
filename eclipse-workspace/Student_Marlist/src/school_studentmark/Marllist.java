package school_studentmark;

import java.util.*;
public class Marllist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int school=1;school<=5;school++)
		{
			for(int student=1;student<=5;student++) 
			{
				Scanner subject =new Scanner(System.in);
				int Tamil;
				int English;
				int Maths;
				int Science;
				int Social;
				int total;
				Float percentage;
				//int total=Tamil+English+Maths+Science+Social;
				System.out.println("Subject Details");
				System.out.println("Enter Tamil mark");
				Tamil=subject.nextInt();
				System.out.println("Enter English mark");
				English=subject.nextInt();
				System.out.println("Enter Maths mark");
				Maths=subject.nextInt();
				System.out.println("Enter Science mark");
				Science=subject.nextInt();
				System.out.println("Enter Social mark");
				Social=subject.nextInt();
				total=Tamil+English+Maths+Science+Social;
				percentage =(float) (total/5);
				System.out.println("Enter Tamil Mark :::"+Tamil);
				System.out.println("Enter English Mark :::"+English);
				System.out.println("Enter Maths Mark :::"+Maths);
				System.out.println("Enter Science Mark :::"+Science);
				System.out.println("Enter Social Mark :::"+Social);
				System.out.println();
				System.out.println();
				System.out.println("Total Mark ::::::"+total);
				System.out.println("Total Mark Percentage ::::::"+percentage);
				System.out.println();
				System.out.println();
				subject.close();
			}
			
			System.out.println();
		}
	}

}
