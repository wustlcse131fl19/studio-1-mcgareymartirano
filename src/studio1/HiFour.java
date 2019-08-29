package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String n0 = ap.nextString("Whats the name of the first person?");
		String n1 = ap.nextString("Second Person?");
		String n2 = ap.nextString("Third?");
		String n3 = ap.nextString("Fourth?");
		//
		// Say hello to the names in n0 through n3.
		//
		System.out.println("Greetings " + n0 + ", " + n1 + ", " + n2 + ", and " + n3+ ".");


	}
}
