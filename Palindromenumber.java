package org.org;

public class Palindromenumber {
	 public static void main(String[] args) {
			int num=989 , reminder=0,reverse=0, temp=num;
		   //executes till it becomes zero
			while (num!=0) {
			 reminder = num%10;
			 reverse = reverse*10+reminder;
	   	      num =num/10;
		}
	if (reverse==temp) {
		System.out.println("Palindrome number");
	}else {
		System.out.println("Not a Palindrome number");
	}
	}
	}


