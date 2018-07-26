package com.philips.dxr.entity;

public class Square implements Shape {
	
	private double width;
	
	public Square() {
	}

	public Square(double width) {
		this.width = width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}

		
	@Override
	public void printArea() {
		double area = width * width;
		System.out.println("Area of square = " + area);
	}

}
