package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class removePrimeFromLinkedList {
	
	
	public static boolean isPrime(int num) {
		int flag = 0;

		for (int i = 2; i < (num / 2) + 1; i++) {
			if (num % i == 0) {
				flag = 1;

			}

		}
		if (flag == 1) {
			return false;
		} else
			return true;
	}
  
	public static void main(String[] args) {
	
	LinkedList l = new LinkedList();
	int i=2;
	
	while(i<100) {
		l.add(i++);
		
	}
	Iterator itr = l.iterator() ;
	
	while(itr.hasNext()) {
		
		int temp=(Integer)(itr.next());
		//System.out.println(temp);
		boolean ans = isPrime(temp);
		
		if (ans) {
			itr.remove();
		}
	}
	
	System.out.println(l);
	
		
		
		
		
	}
	

	}


