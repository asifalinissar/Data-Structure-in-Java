
//problem linkedList { 1,2,3,3,3,5,5,2,2,6,7,7}
//in the linkedList  the same elements are arranged together,we want to avoid the repetition of the
//element of in the element;

// login :
// two variables declare current and temporary ;
// current start with head and temporary null ; temporary = current ; 
// temporary = temp.next check that is equal to the current , if equal temporary to temp.next ;
// also current to current.next ; check again temporary = current ; temporary only go to next;

public class SlinkedListprob {
	
	// created a class for the Node;
	class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
		
	}
	
	public Node head = null;
	public Node tail = null;
	
	// method for adding the Node
	public void addNode(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			tail.next = newNode;
		}tail = newNode;
	}
	
	//method for display the Node;
	public void display() {
		
		Node temp = head;
		if(head == null) {
			System.out.println("the list is empty");
			return;
		}
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	//method for avoidRepetition;
//	public void avoidRepetition() {
//		
//		
//		Node current = head;
//		
//		while(current != null) {
//			Node next = current.next;
//			while(next != null && current.data == next.data) {
//				next = next.next;
//			}
//			current.next = next;
//			current = current.next;
//			
//			if(current == tail && current.data == next.data) {
//				tail = current;
//			}
//			
//		
//		}
//	}
	
	// another method 
	public void avoidRepetition() {
		
		Node current = head;
		Node temp = current;
		
		if(head == null) {
			System.out.println("this list is empty");
			return;
		}
		while(temp != null && temp.next != null) {
			temp = temp.next;
			if(current.data == temp.data) {
				temp = temp.next;
				continue;
			}else {
				current.next = temp;
				current = current.next;
			}
		}
		
	}

	
	
	public static void main(String [] args) {
		SlinkedListprob list = new SlinkedListprob();
		//problem linkedList { 1,2,3,3,3,5,5,2,2,6,7,7}
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.addNode(3);
		list.addNode(3);
		list.addNode(5);
		list.addNode(5);
		list.addNode(2);
		list.addNode(2);
		list.addNode(6);
		list.addNode(7);
		list.addNode(7);
		
		
//		list.display();
		
		list.avoidRepetition();
		list.display();
	}
}
