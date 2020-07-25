package com.dataStructures.learning;

public class StackImplReverseString {
	
	private int top=-1;
	
	private int maxSize;
	
	private String[] arr;

	public StackImplReverseString(int maxSize) {
		super();
		this.maxSize = maxSize;
		this.arr=new String[maxSize];
	}
	
	public boolean push(String str)
	{
		++top;
		arr[top]=str;
		return true;
	}
	
	public String pop()
	{
		int old_top=top;
		--top;
		String value=arr[old_top];
		return value;
	}
	
	public static void main(String args[])
	{
		StackImplReverseString stack=new StackImplReverseString(4);
		stack.push("M");
		stack.push("A");
		stack.push("N");
		stack.push("U");
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.pop());

		System.out.println(stack.pop());

		
		
	}
	

}
