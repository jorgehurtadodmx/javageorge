package simpleClasses;

public class Light {

	public static void main(String[] args) {
		
		int lightspeed;
		long days;
		long seconds;
		long distance;
		
		// approximate speed of light in miles per second.
		lightspeed = 186000;
		
		days = 1000; // specify number of days here
		
		seconds = days * 24 * 60  * 60; // conversion to second
		
		distance = lightspeed * seconds; //compute distance
		
		System.out.print("In " + days);
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");

	}

}