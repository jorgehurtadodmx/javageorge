package simpleClasses;

public class BoolTest {

	public static void main(String[] args) {

		
		boolean b;
		
		b = false;
		System.out.println("b is " + b);
		
		b = true;
		System.out.println("b is " + b);
		
		// a boolean value can control the if statement
		if(b) {
			System.out.println("Esto es ejecutado");
		}
		
		b = false;
		if (b) {
			System.out.println("Esto no es ejecutado");
		}
		
		// outcome of a relational operator is a boolean value
		System.out.println("10 > 9 " + (10 > 9));
		
		
		
		
	}

}
