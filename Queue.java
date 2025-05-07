
public class Queue {
	
	class Node{
		int data;
		Node next;
		
		Node (int data){
			this.data = data;
		}
	}
	
	public Node front ;
	public Node rear;
	
	//method for Enqueue
	void enqueue (int data) {
		Node newNode = new Node(data);
		
		if(rear == null ) {
			front = rear = newNode;
		}rear.next = newNode;
		rear = newNode;
		
	}
	
	
	//method for Dequeue;
	void dequeue(){
		if(front == null) {
			System.out.println("empty");
			return;
		}
		front = front.next;
		
		if(front.next == null) {
			rear = null;
		}
		
		
	}
	
	
	// method for display;
	public void display() {
		
		Node temp = front;
		if(temp == null ) {
			System.out.println(" Queue is empty");
			return;
		}while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		
		//make the object;
		Queue Qu = new Queue();
		Qu.enqueue(2);
		Qu.enqueue(2);
		Qu.enqueue(3);
		Qu.enqueue(6);
		
		Qu.display();
		
		Qu.dequeue();
		
		Qu.display();
		Qu.dequeue();
		Qu.display();
	}

}
