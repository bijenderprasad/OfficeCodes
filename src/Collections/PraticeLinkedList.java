package Collections;

public class PraticeLinkedList {

	node head ;
	class node {
		int data;
		node next;

		node(int d) {
			data = d;
			next = null;
		}

	}

	public void push(int new_data) {
	node new_node = new node (new_data);
	new_node.next=head;
	head = new_node;
	}

	public void insertAfter(node prev_node, int new_data) {
		   if (prev_node == null) 
	        { 
	            System.out.println("The given previous node cannot be null"); 
	            return; 
	        } 
		   node new_node = new node (new_data);
		  
		   new_node.next = prev_node.next;
		   prev_node.next = new_node;
		   }
	
	public void append (int new_data) {
		node new_node = new node (new_data);
		if (head == null) {
			head = new node (new_data);
			return;
		}
		new_node.next = null;
		node last = head;
		 while (last.next != null) 
	            last = last.next; 
		 last.next = new_node; 
	        return; 
		
	}
	
	 public void printList() 
	    { 
	        node tnode = head; 
	        while (tnode != null) 
	        { 
	            System.out.print(tnode.data+" "); 
	            tnode = tnode.next; 
	        } 
	        System.out.println();
	    } 
	 
	 void deletenode(int key) {
		node temp =  head;
		node prev = null;
		
		while (temp!=null && temp.data!=key) {
			prev = temp;
			temp= temp.next;
		}
		if (temp==null) {
			return;
		}
		 
		prev.next=temp.next;
	 }
	 
	 void findLength() {
		 node temp = head ;
		 int len = 0;
		 while (temp!=null) {
			 len++;
			 temp = temp.next;
		 }
		 System.out.println("length of list = " +len );
	 }
	 
	 int returnLength() {
		 node temp = head ;
		 int len = 0;
		 while (temp!=null) {
			 len++;
			 temp = temp.next;
		 }
		return len;
	 }
	 
	 void nthElementfromStart(int key) {
		 node temp = head;
		 int count = 0;
		 while (count!=key && temp!=null) {
			 count++;
			temp = temp.next; 
		 }
		 System.out.println("Element at nth place = " +temp.data);
	 }
	 
	 
	 void nthElementFromEnd(int key) {
		 node temp = head;
		 int count = returnLength() - key - 1;
		 int loop = 0;
		 while (count!=loop) {
			 loop++;
			 temp = temp.next;
		 }
		 System.out.println("Element at nth place from end = " +temp.data);
	 }
	 
	 void occuranceOfElement(int num) {
		 node temp = head;
		 int count = 0 ;
		 while (temp!=null) {
			 if (temp.data == num) {
				 count++;
				 
			 }temp = temp.next;
		 }
		 System.out.println(num + " occured in a linked list " + count+" times");
	 }
	 
	 public static void main (String [] args) {
		 PraticeLinkedList pl= new PraticeLinkedList();
		 pl.append(11);
		 pl.append(21);
		 pl.append(43);
		 pl.append(21);
		 pl.append(14);
		 pl.append(21);
		pl.printList();
		pl.deletenode(5);
		pl.printList();
		//pl.findLength();
		//pl.nthElementfromStart(2);
		//pl.nthElementFromEnd(1);
		//pl.occuranceOfElement(21);
		 
	 }


}
