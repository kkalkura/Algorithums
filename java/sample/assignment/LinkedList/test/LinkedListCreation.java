package sample.assignment.LinkedList.test;

import sample.assignment.LinkedList.ListNode;

public class LinkedListCreation {
	
	public static void main(String[] args){
		System.out.println("Inside  main");
		ListNode current = null;
		int size = 10;
		ListNode result =  null;
		for(int i =0 ;i<=size;i++){
			 result = new ListNode(i);
			result.next = current;
			current = result;
		}
		
		printNodes(result);
		
		
		
	}
	
	
	public static void printNodes(ListNode node1) {
    	ListNode start = node1;
        while (start != null) {   	
 	            System.out.print(start.val + "->");
        	 start = start.next;
        	
           
        }
    }
	

}
