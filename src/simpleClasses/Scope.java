package simpleClasses;

public class Scope {

	public static void main(String[] args) {

		// showing block scope
		int x; // known to all the code within main
		x = 10;
		
		if(x == 10) { //start of a new scope
			int y = 20; // known only to this block
			
			// x and y both known here.
			System.out.println("x and y: " + x + " " + y);
			x = y*2;
		}
		// y = 100; // error because y is not known here
		// x is still known here
		System.out.println("x is "  + x);
	}

}
