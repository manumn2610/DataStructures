package com.dataStructures.learning;

public class ReverseString {
	


	String str;
	int top = -1;

	public ReverseString(String str) {

		this.str = str;

	}

	public String reverse() {
		int maxSize = str.length();
		System.out.println("String Length" + maxSize);
		String rev = "";
		for (int i = maxSize-1; i >=0; i--) {
			System.out.println(i);
			rev = rev + str.charAt(i);
			System.out.println(str.charAt(i));

		}
		
		

		return rev;
	}

	public static void main(String args[]) {
		ReverseString rev = new ReverseString("Manu");

		System.out.println(rev.reverse());
	}

}
