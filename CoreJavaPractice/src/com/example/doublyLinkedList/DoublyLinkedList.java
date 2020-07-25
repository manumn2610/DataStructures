package com.example.doublyLinkedList;

public class DoublyLinkedList {

	private int data;
	private Node n;
	private Node head;
	private Node tail;
	private int length;

	public DoublyLinkedList() {

		this.head = null;
		this.tail = null;
	}

	/*
	 * public void insertStart(int data) { Node node = new Node(); node.data = data;
	 * if (isEmpty()) {
	 * 
	 * tail = node; }
	 * 
	 * else {
	 * 
	 * head.previous = node;
	 * 
	 * } node.next = head; head = node; length++;
	 * 
	 * }
	 */

	public void insertStart(int data) {

		Node node = new Node();
		node.data = data;

		if (isEmpty()) {

			tail = node;
			head = node;
		}

		else {

			head.previous = node;
			node.next = head;
			head = node;

		}
		length++;
	}

	public void insertEnd(int data) {

		Node node = new Node();
		node.data = data;
		if (isEmpty()) {
			insertStart(data);
		} else {
			Node n = head;

			while (n.next != null) {

				n = n.next;
			}

			n.next = node;
			node.previous = n;
			length++;

		}

	}

	public void insertATindex(int data, int index) {

		if (index == 0) {

			insertStart(data);
		}

		else {

			Node node = new Node();
			node.data = data;

			n = head;

			for (int i = 0; i < index - 1; i++) {

				n = n.next;
			}

			Node old_next = n.next;
			System.out.println("old_next" + old_next.data);
			n.next = node;
			node.previous = n;
			node.next = old_next;
			old_next.previous = node;
			length++;

		}
	}

	public void delete(int index) {

		if (!isEmpty()) {

			Node n = head;

			if (index == 0) {
				Node node = n.next;
				node.previous = null;
				head = node;
				length--;

			}
		} else {

			System.out.println("LinkedList is empty");
		}
	}

	public boolean isEmpty() {

		return (length == 0);
	}

	public void view() {

		Node n = head;

		while (n.next != null) {

			System.out.println(n.data);

			n = n.next;

		}

		System.out.println(n.data);

	}

}
