/* 
 * File: FixingBrokenJava.java

 * Name:Egemen Guray
 * Section Leader:Sherman Leung
 * 
 * This program does not work as intended.  It contains both
 * compile-time errors (errors that prevent the compiler from even
 * running the program) and run-time errors (errors where the
 * program does not function as intended).  Your job is to fix
 * this program so that it works correctly.  Note that it is *not*
 * sufficient to simply fix the compiler errors; you will need to
 * update the logic as well.
 * 
 * This program attempts to read an integer greater than one from the
 * user, then check whether that integer is prime (whether its only
 * divisors are 1 and itself). If so, it prints a message saying
 * that the number is prime; otherwise it says that the number is
 * composite.
 */
	import acm.program.*;
public class FixingBrokenJava extends ConsoleProgram {
	/* Reads a number from the user and reports whether or not it
	 * is prime.
	 */

	public void run() {
		/* Get the value from the user. */
		int n = readInput();
		if(n > 1){
			/* Check whether or not it is prime. */
			if (isPrime(n)) {
				println(n + " is prime.");
			}else{
				println(n + " is composite.");
			}
		}
	}
	
	/**
	 * Given a positive integer, returns whether that integer is
	 * prime.
	 * 
	 * @param value The value to test.
	 * @return Whether or not it is prime.
	 */

	private boolean isPrime(int n) {
		/* Try all possible divisors of the number.  If any of them
		 * cleanly divide the number, we return that the number is
		 * composite.
		 */

			for (int i = 2; i <= (n-1); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private int readInput(){
		/* Get an initial value. */
		int n = readInt("Enter an integer greater than 1: ");
		/* If the value wasn't greater than one, reprompt. */
		while(n <= 1) {
			println("Please enter an integer greater than 1");
			int n2 = readInt("Enter an integer greater than 1: ");
			if(n2 > 1){
				return n2;
			}
		}
		return n;
	}
}


	