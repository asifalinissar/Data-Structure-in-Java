

public class SlinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	 
	
	// field or instant variable declaration;
	
	public Node head  = null;
	public Node tail  = null;
	
	
	// method for adding elements in the linked list
	public void addNode(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
		}else{
			tail.next = newNode;
		}
		tail = newNode;
	}
	
	// method for deleting the node;
	
	public void delete(int data) {
		//if head is delete;
		Node temp = head, prev = null ;
		if(temp != null && temp.data == data) {
			head = temp.next;
			return;
		}
		while(temp != null && temp.data != data) {
			prev = temp;
			temp = temp.next;
		}
		if(temp== null) {
			return;	
		}
		if(temp == tail) {
			tail = prev;
			tail.next = null;
			return;
		}
		prev.next = temp.next;
		
		
		
	}
	
	
	// method for display the SingleLinkedlist
	public void display() {
		if(head == null) {
			System.out.println("the list is empty");
			return;
		}
		
		Node temp = head;
		
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
		
	
	
	// method for adding in between;
	
	public void addInbetween(int target, int data) {
		
		Node newNode = new Node(data);
		Node temp = head;
		if(temp.data == target) {
			head = newNode;
			head.next = temp;
		}
		while(temp != null && temp.data != target) {
			temp = temp.next;
		}if(temp== null) {
			return;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		if(temp== tail) {
			tail.next = newNode;
			tail = newNode;
			return;
			}
	}
	
	// main method;
	
	public static void main(String[] args ){
		
		SlinkedList list = new SlinkedList();
		
		list.display();
		list.addNode(50);
		list.addNode(60);
		list.addNode(40);
		list.addNode(349);
		list.addNode(34);
		list.addNode(67);
		
		list.delete(349);
		list.delete(34);
		
		list.addInbetween(40, 10);
		list.addInbetween(67, 44);
		list.addInbetween(0, 90);
		list.addInbetween(44, 349);
	

		
		
		list.display();
		
		
	}
	

}
