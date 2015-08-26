package org.dimigo.inheritance;

public class Figure {

private int centerX;
private int centerY;
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected void printCenter() {
		System.out.println("중심 좌표 : ("+centerX+","+centerY+")");
	}
	
	protected void moveFigure(int x, int y) {
		this.centerX += x;
		this.centerY += y;
	}
	
	protected double calcArea() {
		return 0.0;
	}
	

}
