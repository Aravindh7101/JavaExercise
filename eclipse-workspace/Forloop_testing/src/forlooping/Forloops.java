package forlooping;

public class Forloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int row=1; row<=3; row++)
		{
		 for(int space=1; space<=row;space++)
		 {
			 System.out.print(" ");
		 }
		 for(int num1=row;num1<=3;num1++)
		 {
			 System.out.print(num1);
		 }
		 for(int num2=2;num2>=row;num2--)
		 {
			 System.out.print(num2);
		 }
			System.out.println();
		}
	}

}

