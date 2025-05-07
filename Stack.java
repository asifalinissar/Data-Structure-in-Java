
public class Stack {
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public Node top;
	
	// method for push;
	public void push(int data) {
		Node newNode = new Node(data);
		
		if(top == null) {
			top = newNode;
		}else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	//method for the pop ;
	public void pop() {
		Node temp = top;
		if(temp == null) {
			System.out.println("this stack is empty");
		}else {
			System.out.println(temp.data);
			top = temp.next;
		}
	}
	
	// method for display;
	public void display() {
		
		Node temp = top;
		if(temp == null) {
			System.out.println(" the stack is empty");
		}
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	
	// main method
	public static void main (String [] args) {
		Stack st = new Stack();//object of Stack 
		
		st.push(2);
		st.push(5);
		st.push(6);
		st.push(7);
		
		st.pop();
		st.pop();
		
		st.display();
	}

}
