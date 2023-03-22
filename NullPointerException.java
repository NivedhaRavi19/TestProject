package org.org;

public class NullPointerException {
	public static void main(String[] args) {
		String s = null;
		System.out.println(System.identityHashCode(s));
	    char a = s.charAt(4);
	    System.out.println(a);

}
}

	


