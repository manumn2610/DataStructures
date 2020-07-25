package com.dataStructures.learning;

public class QueueImpl {

	int maxSize = 0;
	int front;
	int rear = -1;
	int noOfitems;
	String arrayQ[];

	public QueueImpl(int maxSize) {

		this.maxSize = maxSize;
		arrayQ = new String[maxSize];

	}

	public void insert(String val) {

		if (!(rear == maxSize - 1)) {
			rear++;
			System.out.println(rear);
			System.out.println(val);
			arrayQ[rear] = val;
			noOfitems++;
		} else {

			System.out.println("Queue is full");
		}
	}

	public String pop() {
		String value = "";
		if (!(front >maxSize - 1)) {
			value = arrayQ[front];
			front++;
			noOfitems--;
		}
		return value;
	}

	public void view()

	{

		for (int i = 0; i < maxSize - 1; i++) {

			System.out.println(arrayQ[i]);
		}
	}

	public static void main(String args[]) {
		QueueImpl q = new QueueImpl(4);
		q.insert("MAnu");
		System.out.println("inserted1Manu");
		q.insert("Paddy");
		q.insert("yyyy");
		System.out.println("inserted1Paddy");

		q.insert("HArshu");
		q.insert("TTTTT");

		q.view();
	System.out.println("removed items>>>"+q.pop());
	System.out.println("removed items>>>"+q.pop());

	System.out.println("removed items>>>"+q.pop());

	System.out.println("removed items>>>"+q.pop());


	}

}
