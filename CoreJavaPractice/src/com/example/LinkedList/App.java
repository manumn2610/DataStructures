package com.example.LinkedList;

public class App {

	public static void main(String[] args) {
LinkedList list=new LinkedList();
list.insert(34);
list.insert(35);

list.insert(36);
list.insert(100);
list.inserAtHead(9999);

list.inserAtIndex(11111, 2);
list.inserAtIndex(8888, 0);
list.display();

list.delete(3);

System.out.println("After deletion");
list.display();

	}

}
