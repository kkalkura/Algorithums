package sample.assignment.LinkedList.test;

import sample.singleLinkedList.ListNode;

public class ReeverseLinkedList2 {
	
	public static void main(String[] args){
		System.out.println("Inside the main");
		ReeverseLinkedList2 revers = new ReeverseLinkedList2();
		revers.head = revers.constructLinkedList();
		revers.printNodes(revers.head);
		System.out.println();
	//	revers.printNodes( revers.reverseLinkedListmethod2(revers.head));
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
	     //   fifth.next= sixth;
	     //   sixth.next = seventh;
	     //   seventh.next = eighth;
	      //  eighth.next = ninth;
		
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
		 ListNode current=null,next=null,prev=null;
		 if(head==null){
			 return null;
		 }
		 
		 current = head;
		 while(current!=null){
			 next = current.next;
			 current.next = prev;
			 prev = current;
			 current = next;
			 
		 }
		 return prev;
	 }
	 
	 
	 public ListNode reverseLinkedListmethod2(ListNode head) {
		 ListNode temp =null,next;
		 next = head.next;
		 while(head!=null ){
			 head.next =temp;
			 temp = head;
			 head = next;
			 if(next!=null){
				 next = head.next; 
			 }
			
		 }
		 return temp;
		 
	 }
	 
	 
	 
	 public ListNode reverseLinkedListmethodsizeK(ListNode head  ,int k) {
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
			 head.next = reverseLinkedListmethodsizeK(next , k);
		 }
		 return temp;
		 
	 }

}
