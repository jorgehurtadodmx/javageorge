package simpleClasses;

public class LifeTime12 {

	public static void main(String[] args) {

		int x;
		
		for (x = 0; x < 3; x++) {
			int y = -1; // y is initialized each time we enter the block
			System.out.println("y is: " + y); //this always prints 1 since y will always be 1
			y = 100;
			System.out.println("y is now: " + y);
		}
		
	}

}
