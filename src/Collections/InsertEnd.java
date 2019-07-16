package Collections;

import java.awt.Cursor;
import java.util.Iterator;

import com.graphbuilder.struc.LinkedList;
import com.sun.xml.bind.v2.runtime.reflect.ListIterator;

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
    
    public void addAtStart(int data ) {
    	node nn = new node (data);
    	if (head==null) {
    		head = nn;
    		tail = nn;
    		
    	}
    	else
    	//newNode will be added after tail such that tail's next will point to newNode  
    		head.next= nn;
    	//newNode will become new tail of the list  
    		head = nn;
    		
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
		 LinkedList ll = new LinkedList();
	        //Adding 1 to the list  
	        sList.addAtStart(1);  
	        sList.addAtStart(5);  
	        sList.addAtStart(3);  
	        sList.addAtStart(2);
	        sList.addAtStart(12);
	        


	        sList.display();
	        	        
	        LinkedList linkedlist = new LinkedList();
	     
	        // Obtaining Iterator
	      
	        // Iterating the list in forward direction
	        System.out.println("LinkedList elements:");
	        while(it.hasNext()){
	           System.out.println(it.next());
	        }
	}

}
