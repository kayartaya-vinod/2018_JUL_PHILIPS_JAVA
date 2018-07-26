package com.philips.dxr.programs;

public class P06_HandlingExceptions {

	public static void main(String[] args) throws Throwable {
		try {
			int num = Integer.parseInt(args[0]);
			int den = Integer.parseInt(args[1]);

			int quot = num / den;

			System.out.printf("%d / %d = %d\n", num, den, quot);
		} catch (NumberFormatException e) {
			System.out.println("Invalid datatype for numbers!");
			// return
			// throw new Throwable("Throwing just like that...");
			// System.exit(0);
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid operation");
		} catch (Exception e) {
			System.out.println("There was an erro: " + e);
		} finally {
			// not executed on System.exit(0);
			System.out.println("Doing something finally....");
		}

		System.out.println("End of main!");
	}
}
