package com.example.doublyLinkedList;

public class DoublyLinkedList1 {

	Node head;

	public void insertAt(int index, int data) {
		Node n = new Node();
		n.data = data;
		if (index == 0)

		{
			head = n;
		}
		
		else {
			Node node=head;
			Node previous=null;
			Node next=null;
			
			for(int i=0;i<index-1;i++)
			{
				node=node.next;
				System.out.println("in the loop>>>>>>"+node.data);
				
			}
			
			Node old_next=node.next;
			Node current_next=old_next.next;
			node.next=n;
			n.previous=node;
			n.next=current_next;
			
		}

	}

	public void insertAtStart(int data) {

		if (head == null) {

			Node n = new Node();
			n.data = data;
			head = n;

		}

		else {

			Node node = new Node();
			node.data = data;
			Node n = head;
			while (n.next != null) {
				n = n.next;

			}

			n.next = node;
			node.previous = n;

		}

	}

	public void display() {

		Node n = head;
		while (n.next != null) {

			System.out.println(n.data);
			if (n.next != null)
				System.out.println("next>>>>" + n.next.data);
			if (n.previous != null)
				System.out.println("previous>>>>" + n.previous.data);

			n = n.next;

		}
		System.out.println(n.data);

	}

}
