package com.philips.dxr.entity;

public class Circle implements Shape {

	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public void printArea() {
		double area = PI * radius * radius;
		System.out.println("Area of the circle is " + area + " sq.units");
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
