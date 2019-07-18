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
	 
	 public static void main (String [] args) {
		 PraticeLinkedList pl= new PraticeLinkedList();
		 pl.append(1);
		 pl.append(2);
		 pl.append(3);
		 pl.append(4);
		pl.printList();
		pl.deletenode(5);
		pl.printList();
		 
	 }


}
