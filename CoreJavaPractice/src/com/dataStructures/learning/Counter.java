package com.dataStructures.learning;

public class Counter {

	String str;

	public Counter(String str) {
		this.str = str;

	}

	public String getCurrentValue() {

		return str;
	}

	public String toString() {
		return "" + str;

	}

	public String increment() {
		int value = Integer.parseInt(str);
		
         str=String.valueOf(++value);
         
         return str;

	}

	public static void main(String args[]) {
		Counter counter = new Counter("99");
		System.out.println(counter.getCurrentValue());
		System.out.println(counter.toString());
		System.out.println(counter.increment());
		System.out.println(counter.getCurrentValue());

	}

}
