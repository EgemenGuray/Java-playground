/*

 * File: PythagoreanTheorem.java
 * Name: Egemen Guray
 * Section Leader: Sherman Leung
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		println("Enter values to compute the Phythagorean theorem.");
		double a = readA(); 
		double b = readB();
		/*
		 * Calculates the formula in order to find the c
		 */
		double c = Math.sqrt((a*a)+(b*b));
		println("c = " + c + "");
		
	}
	/*
	*Gets the A value checks a in order to make a positive number
	*/
	private double readA(){
		double a = readDouble("a: "); 
		while(a<=0){
			println("Please enter a value which is bigger than 0");
			double a2 = readDouble("a: ");
			if (a2 > 0){
				return a2;
			}
		}
		return a;
	}
	/*
	*Gets the B value checks a in order to make b positive number
	*/
	private double readB(){
		double b = readDouble("b: "); 
		while(b<=0){
			println("Please enter a value which is bigger than 0");
			double b2 = readDouble("b: ");
			if (b2 > 0){
				return b2;
			}
		}
		return b;	
	}
}
