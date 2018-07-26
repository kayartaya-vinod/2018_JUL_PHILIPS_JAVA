package com.philips.dxr.programs;

import com.philips.dxr.entity.Circle;
import com.philips.dxr.entity.Shape;
import com.philips.dxr.entity.Square;

public class P05_Polymorphism {

	// a polymorphic method
	// this method is supplied with an instance of Circle or Square,
	// but is not aware of this
	static void printShapeDetails(Shape sh) {
		System.out.println("sh is an instanceof " + sh.getClass().getName());
		System.out.println("Area of this shape is: ");
		sh.printArea();
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {

		Circle c1 = new Circle(12.45);
		Square s1 = new Square(12.45);

		printShapeDetails(c1);
		printShapeDetails(s1);

		Shape sh1 = new Shape() {
			@Override
			public void printArea() {
				System.out.println("Area cannot be calculated for this Shape!");
			}
		};
		
		
		Shape sh2 =  () -> System.out.println("Area cannot be calculated for this Shape!");

		
		printShapeDetails(sh1);
		printShapeDetails(sh2);
		printShapeDetails(() -> System.out.println("Area cannot be calculated for this Shape!"));
	}
}
