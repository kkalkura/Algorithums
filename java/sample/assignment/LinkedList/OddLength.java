package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;

public class OddLength extends SingleLinkedList {
	
	
	public static void main(String[] args){
		OddLength list = new OddLength();
        list.printNodes();
        boolean result = list.findmiddleElement(list.constructLinkedList());
	    System.out.println("The value is "+result);
	    	   
    }
	
	public boolean findmiddleElement(ListNode head){
		
		ListNode slow =head;
		ListNode fast = head;
		if(head==null){
			return true;
		}
		if(head.next==null){
			return false;
		}
		
		while( fast!=null && fast.next!=null ){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		if(fast==null){
			return true;
		}
		
		if(fast.next==null){
			return false;
		}
		return false;
		
	}
	
	
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
	//        fifth.next= sixth;
	     //   sixth.next = seventh;
	     //   seventh.next = eighth;
	      //  eighth.next = ninth;
		
	        return start;
		}
	
	

}
