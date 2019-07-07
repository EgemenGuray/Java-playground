/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		outerCircle();
		middleCircle();
		innerCircle();
	}
	/*
	 * Adds outer circle
	 * 
	*/
	private void outerCircle(){
		double x =(getWidth() - FIGURE_WIDTH) / 2;
		double y = (getHeight() - FIGURE_HEIGHT) / 2;
		GOval oval = new GOval( x, y,FIGURE_WIDTH,FIGURE_HEIGHT);
		oval.setColor(Color.red);
		oval.setFilled(true);
		oval.setFillColor(Color.red);
		add(oval);
	}
	/*
	 * Adds middle circle
	 * 
	*/
	private void middleCircle(){
		double x1 =(getWidth() - FIGURE_WIDTH1) / 2;
		double y1 = (getHeight() - FIGURE_HEIGHT1) / 2;
		GOval oval1 = new GOval(x1, y1,FIGURE_WIDTH1,FIGURE_HEIGHT1);
		oval1.setColor(Color.red);
		oval1.setFilled(true);
		oval1.setFillColor(Color.white);
		add(oval1);
	}
	/*
	 * Adds inner circle
	 * 
	*/
	private void innerCircle(){
		double x2 =(getWidth() - FIGURE_WIDTH2) / 2;
		double y2 = (getHeight() - FIGURE_HEIGHT2) / 2;
		GOval oval2 = new GOval(x2,y2,FIGURE_WIDTH2,FIGURE_HEIGHT2);
		oval2.setColor(Color.red);
		oval2.setFilled(true);
		oval2.setFillColor(Color.red);
		add(oval2);
	}
	/*
	*Figure specifications
	*/
	private static final double FIGURE_WIDTH = 144;
	private static final double FIGURE_HEIGHT = 144;
	private static final double FIGURE_WIDTH1 = 93.6;
	private static final double FIGURE_HEIGHT1 = 93.6;
	private static final double FIGURE_WIDTH2 = 43.2;
	private static final double FIGURE_HEIGHT2 = 43.2;
		
}
