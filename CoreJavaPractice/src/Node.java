
public class Node {

	private int data;
	private Node next = null;


	public static void main(String args[]) {

		Node nodeA = new Node();
		nodeA.data = 4;

		Node nodeB = new Node();
		nodeB.data = 5;

		Node nodeC = new Node();
		nodeC.data = 6;

		Node nodeD = new Node();
		nodeD.data = 4;

		nodeA.next = nodeB;

		nodeB.next = nodeC;

		nodeC.next = nodeD;

		
		
		System.out.println(lengthofNode(nodeA));

	}
	
	public static int lengthofNode(Node node)
	{
		
		Node currentNode=node;
		
		int length=0;
		while((currentNode!=null))
		{
			
			System.out.println(currentNode);
			length++;
			currentNode=currentNode.next;
			
		}
		
		return length;
			
		
		
	}

}
