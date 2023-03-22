package org.org;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);
		}
	   catch (NumberFormatException e) {
		   System.out.println("Number Format Error");
	}
		 catch (StringIndexOutOfBoundsException e) {
			   System.out.println("Index out of range");
		 }
		catch (ArithmeticException  e) {
			   System.out.println("by/0");
		 }
		finally {
			System.out.println("Outer Finally");
		}
	System.out.println(5);
	}
	}
		