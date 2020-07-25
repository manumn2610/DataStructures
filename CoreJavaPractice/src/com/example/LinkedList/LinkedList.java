package com.example.LinkedList;

public class LinkedList {

	Node head;
	int index = -1;

	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {

			head = node;
		}

		else {
			Node n = head;

			while (n.next != null) {
				n = n.next;

			}

			n.next = node;

		}

	}

	public void inserAtHead(int data) {

		Node n = new Node();
		n.data = data;

		if (head == null) {

			head = n;

		} else {
			Node old_head = head;
			System.out.println("old_data" + old_head.data);

			head = n;
			System.out.println("head_data" + head.data);

			head.next = old_head;

			System.out.println("head_next" + old_head.data);

		}

	}

	public void inserAtIndex(int data, int ind) {

		Node n = new Node();
		n.data = data;
		if (ind == 0) {

			System.out.println("Inside index=0 ");

			inserAtHead(data);
		} else if (head != null) {
			Node node = head;
			for (int i = 0; i < ind - 1; i++) {

				node = node.next;

			}
			Node old_next = node.next;
			node.next = n;
			n.next = old_next;

			System.out.println("data at given index" + n.data);

		}
	}

	public void delete(int index) {
		Node n = head;
		for (int i = 0; i < index - 1; i++) {
			n = n.next;
			
			System.out.println("nvalue"+n.data+""+"index"+i);

		}

		Node current = n;
		Node old_next=n.next;
		current.next=old_next.next;

		

	}

	public void display() {

		Node n = head;

		// System.out.println(head.data);

		while (n.next != null) {

			System.out.println(n.data);
			n = n.next;

		}
		System.out.println(n.data);
	}

}
