package abstractkey;

 //abstract public class Abstractobj extends Abstract {  suppose sub class also abstract dont create definition of parent abstract class
public class Abstractobj extends Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Abstract abstobj = new Abstract(); ////Abstrat method cannot be created obj
		//abstobj.play();
		//suppose parents class abstract should define the definition in normal class
		//suppose sub class also abstract dont create definition of parent abstract class
		
		Abstractobj myobj = new Abstractobj();
		myobj.hear();
		myobj.sing();
		myobj.play();
		myobj.music();

	}
	
	public void hear() {
		System.out.println("hear is created");
	}

	public void play() {
		System.out.println(" playing cricket");
	}
	protected void music() {
		System.out.println("hearing music ");
	}

}
