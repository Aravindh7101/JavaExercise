package forlooping;

public class Largeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int [] no= {12,13,1,10,34,10};
		int i=0;
		int max = no[i];
		 while(i<no.length) {
			 i++;
			 if(no[i]>max)
			 {
				 max=no[i];
				 System.out.println(max);
			 }
		 }
	}

}
