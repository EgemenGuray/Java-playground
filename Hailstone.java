/*
 * File: Hailstone.java

 * Name: Egemen Guray
 * Section Leader: Sherman Leung
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		
		int n = initial();
		if(n == 1){
			println("The process took "+1+" to reach "+n++);
		}
		if(n > 1){
			println("Here is the Hailstone sequence for the number that you have picked:");
			while(n != 1){
					if (n % 2 == 0){
					println(n + " is even so I make half:" + n/2 );
			        n = (n/2);
			        if (n != 1){
			        	
			        }
				}else{
					println(n + " is odd so I make 3n+1:" + 3*n+1 );		          
			        n = ((3*n) + 1);
			    }
					
			}
			println("The process took "+" to reach "+n++);
		}
		
	}
	private int initial(){
		
		int n = readInt("Please Enter a Positive Number: ");
		
		while(n < 1) {
			println("Please Enter a Positive Number!!!");
			int n2 = readInt("Please Enter a Positive Number: ");
			if(n2 > 1){
				return n2;
			}
		}
		return n;
}
}
		
	


