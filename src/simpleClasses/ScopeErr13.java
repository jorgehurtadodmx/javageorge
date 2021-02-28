package simpleClasses;

public class ScopeErr13 {

	public static void main(String[] args) {
		//this doesn't compile
		int bar = 1;
		
		{ //new scope
			//int bar = 2; // duplicated variable, already defined, can still be used)
			//bar = 2; this would be correct.
		}
		
		
	}

}
