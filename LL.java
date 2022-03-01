public class LL {
	Node head;
	private int size;
	LL(){
		this.size=0;
	}
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data = data;
			this.next = null;
			size++;
		}
		
	}
	
	public int getSize() {
		return size;
	}
	// add First, last
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		this.head = newNode;
	}
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}
	
	public void printList() {
		
		if(head == null) {
			System.out.print("List is empty");
			return;
		}
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.print("NULL");
	}
	public void deleteFirst() {
		if(head==null) {
			System.out.print("This list is empty\n");
			return;
		}
		size--;
		head = head.next;
			
	}
	public void deleteLast() {
		
		// Edge case one if list is empty
		if(head.next == null) {
			System.out.print("The List is empty \n");
			return;
		}
		size--;
		// Edge case 2 if head.next is null
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		
		secondLast.next = null;
			
		
	}
	public void reverse() {
		if(head == null) { // Edge case
			System.out.print("The List is empty! \n");
			return;
		}
		if(head.next ==  null ) { // Edge case
			System.out.print("List has only one element\n");
			return;
		}
		Node prevNode = head;
		Node currNode = head.next;
		
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			//update 
			prevNode =currNode;
			currNode = nextNode;
			
		}
		
		head.next = null;
		head = prevNode;
		
		
	}
}
