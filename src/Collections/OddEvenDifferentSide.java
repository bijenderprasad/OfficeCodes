package Collections;

import java.util.Scanner;

import com.graphbuilder.struc.LinkedList;

public class OddEvenDifferentSide {

	public static void main(String[] args) {
	
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner (System.in);
		System.out.println("Please press space after insertion of element");
		String num = sc.nextLine();
		String [] word = num.split(" ");
		
		for(String s:word) {
			int temp=Integer.parseInt(s);
			if(temp%2==0) {
				ll.addToHead(temp);
			}
			else
				ll.addToTail(temp);
		
		}
		
			System.out.println(ll);
		
	}

}
