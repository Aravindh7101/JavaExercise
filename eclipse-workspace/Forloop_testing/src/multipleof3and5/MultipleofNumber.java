package multipleof3and5;

public class MultipleofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleofNumber numb = new MultipleofNumber();
		numb.whilemoth();
		numb.whilelo();
		for (int i = 1; i <= 20; i++) { // this is only divide 3 and 5
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("3 and 5 divide only " + i);
				}
			}
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("3 and 5 divide " + i);
			}
		}

	}

	public void whilemoth() {
		int i = 1;
		while (i <= 20) {
			if (i % 3 == 0) {
				if (i % 5 == 0) {
					System.out.println("while method find 3 and 5 " + i);
				}
			}
			i++;
		}
	}
	public void whilelo() {
		//int n = 0;
		int k=1;
		while(k<=20) {
			if(k%3==0 || k%5==0) {
				System.out.println(k);
			}
			k++;
		}
	}
	
}
