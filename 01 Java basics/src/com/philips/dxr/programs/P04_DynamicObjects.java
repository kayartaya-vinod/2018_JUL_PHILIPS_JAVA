package com.philips.dxr.programs;

public class P04_DynamicObjects {

	public static void main(String[] args) throws Exception {

		String classToLoad = "com.philips.dxr.entity.Employee";

		// System.out.println("Before loading the user class");
		// load the class, if exists from a string
		Class<?> cls = Class.forName(classToLoad);
		// System.out.println("After loading the user class");
		
		Object obj = cls.newInstance();
		System.out.println("obj is an instanceof " + obj.getClass().getName());
		System.out.println(obj);
	}
}
