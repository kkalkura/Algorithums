package sample.assignment.LinkedList.test;

import sample.singleLinkedList.ListNode;

public class ReeverseLinkedList {
	
	public static void main(String[] args){
		System.out.println("Inside the main");
		ReeverseLinkedList revers = new ReeverseLinkedList();
		revers.head = revers.constructLinkedList();
		revers.printNodes(revers.head);
		
		System.out.println("After reversing");
		//revers.printNodes( revers.reverseLinkedList(revers.head));
		revers.printNodes( revers.reverseLinkedListmethodsizeK(revers.head,2));
	}
	
	private ListNode head;
	 public ListNode constructLinkedList(){
			
			ListNode   start =  new ListNode(1);
	        ListNode first = new ListNode(2);
	        ListNode second = new ListNode(3);
	        ListNode third = new ListNode(4);
	        ListNode forth = new ListNode(5);
	        ListNode fifth = new ListNode(6);
	        ListNode sixth = new ListNode(7);
	        ListNode seventh = new ListNode(8);
	        ListNode eighth = new ListNode(9);
	        ListNode ninth = new ListNode(10);
	        
	        start.next= first;
	        first.next= second;
	         second.next= third;
	         third.next =forth;
	        forth.next = fifth;
	       fifth.next= sixth;
	        sixth.next = seventh;
	        seventh.next = eighth;
	        eighth.next = ninth;
		
	        return start;
		}
	 
	 public void printNodes(ListNode head) {
	    	ListNode start = head;
	        while (start != null) {   	
	 	            System.out.print(start.val + "->");
	        	 start = start.next;
	        	
	           
	        }
	    }
	 
	 public ListNode reverseLinkedList(ListNode head) {
		ListNode current = head,previous = null,next =null;
		
		while(current!=null){
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		
		return previous;
	
		 
		
		
	 }
	 
	 
	/* public ListNode reverseLinkedListmethod2(ListNode head) {
		 
		 
	 } */
	 
	 
	 
	 public ListNode reverseLinkedListmethodsizeK(ListNode head , int k) {
		 ListNode temp =null,next;
		 next = head.next;
		 int count =0;
		 while(head!=null && count<k ){
			 head.next =temp;
			 temp = head;
			 head = next;
			 if(next!=null){
				 next = head.next; 
			 }
			 count++;		
		 }
		 
		 if(next!=null){
			 head.next = reverseLinkedListmethodsizeK(head , k);
		 }
		 return head;
		 
	 }

}
