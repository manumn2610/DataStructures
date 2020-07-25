package com.example.doublyLinkedList;

public class App {

	public static void main(String args[]) {

		DoublyLinkedList list = new DoublyLinkedList();
		list.insertStart(4);
		list.insertStart(5);
		list.insertEnd(9999);
		list.insertStart(6);
		list.insertStart(7);
		list.insertEnd(11);
		System.out.println("before adding at the index>>>>");
		list.view();

		list.insertATindex(1111, 2);

		System.out.println("after adding at the index>>>>");

		list.view();
		
		System.out.println("after deleting  at the index>>>>");
		
list.delete(0);
list.view();


		;
	}

}
