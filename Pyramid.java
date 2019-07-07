/*
 * File: Pyramid.java


 * Name: Egemen Guray
 * Section Leader: Sherman Leung
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	
	
	public void run() {
		/*
		 * Adds 14 stair shaped bricks but in every shape brick number decreases
		 */
		for(int j = BRICKS_IN_BASE; j>0; j--){
			/*
			 * Adds 14 bricks in a stair shape
			 */
			for( int i = 0; i< j;i++){
				/*
				 * Brick position formulas
				 */
				double x = ((getWidth()-(i*BRICK_WIDTH))/2.0)+((BRICK_WIDTH/2.0)*(BRICKS_IN_BASE-j));
				double y = (getHeight()-((j-i)*BRICK_HEIGHT));
				GRect rect = new GRect(x,y,BRICK_WIDTH,BRICK_HEIGHT);
				add(rect);
			}
		}
	}
	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

}

