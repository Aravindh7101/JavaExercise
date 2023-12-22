package singleinheritance;

public class Father {
	private int check = 1000; // private class value only accepted in this classs only

	//inhetitance --- used for code reusability
	protected String petname = "mani";

	public static void main(String[] args) {
		Father fathobj = new Father();
		fathobj.yoga();
		int value = fathobj.check;
		System.out.println(" check balance is " + value);
	}

	public void run() {
		System.out.println(" Father ryn daily");
	}

	private void yoga() {
		System.out.println(" Father yoga ");
	}

	void acting() {
		System.out.println("father acting well");
	}

	protected void open() {
		System.out.println("Father open new accoiunt");

	}
	protected void act() {
		System.out.println(" he is a good acter");
	}
	protected void sing() {
		System.out.println(" Father singing");
	}
}
