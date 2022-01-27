
public class DataStructure {
	
	/* Singly Linked List Node Creation And Insertion */
	
	class Node {
		int data;
		Node next;
		
		public Node() {}
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		}
		else {
			tail.next = newNode;
			tail = newNode;
		}
		
	}
	
	public int countNodes() {
		Node current = head;
		int count = 0;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	public void display() {
		Node current = head;
		
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String...args){
		// TODO Auto-generated method stub
		DataStructure ds = new DataStructure();
		
		ds.addNode(1);
		ds.addNode(2);
		ds.addNode(3);
		ds.addNode(4);
		
		ds.display();
		
		System.out.println("Count of nodes present in the list: " + ds.countNodes());
	}

}
