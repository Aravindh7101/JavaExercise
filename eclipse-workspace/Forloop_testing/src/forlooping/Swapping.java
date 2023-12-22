package forlooping;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=213;
		int y=109;
		 
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 System.out.println("y = "+ y);
		 System.out.println("x = "+ x);
		 
		 System.out.println("1st method");
		 
		 int a=20;
		 int b=30;
		 int temp=a;
		 
		a=b;
		b=temp;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);

	}

}
