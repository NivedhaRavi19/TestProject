package org.org;

public class ExceptionHandling{

	public static void main(String[] args) {
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	try {
		System.out.println(4/0);
	}
	finally {
		System.out.println("Done");
	}
System.out.println(5);
}
}


