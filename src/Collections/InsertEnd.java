package Collections;

public class InsertEnd {
	
	//Represent a node of the singly linked list  
	class node {
		int data;
		node next;

		public node(int d) {
			data = d;
			next = null;
		}
	}
	//Represent the head and tail of the singly linked list  
	node head = null;  
    node tail = null;
    
    //addAtEnd() will add a new node to the end of the list  
    public void addAtEnd(int data) {
    	node nn = new node (data);
    	if (head==null) {
    		head = nn;
    		tail = nn;
    		
    	}
    	else
    	//newNode will be added after tail such that tail's next will point to newNode  
    		tail.next= nn;
    	//newNode will become new tail of the list  
    		tail = nn;
    		
    }
    
    public void display() {  
        //Node current will point to head  
        node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the end of the list: ");  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.println(current.data + " ");
            current = current.next;  
        }  
        System.out.println();  
    }  
	
	public static void main(String[] args) {
		 InsertEnd sList = new InsertEnd();  
		  
	        //Adding 1 to the list  
	        sList.addAtEnd(1);  
	        sList.addAtEnd(2); 
	        sList.addAtEnd(3);  
	        sList.display();
	}

}
