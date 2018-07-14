package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;

public class MiddleElement extends SingleLinkedList {
	
	
	public static void main(String[] args){
		MiddleElement list = new MiddleElement();
        list.printNodes();
        ListNode result = list.findmiddleElement(list.constructLinkedList());
        if(result!=null){
	    	   System.out.println("The value is "+result.val);
	    	   
	       }
	       	 
       
    }
	
	public ListNode findmiddleElement(ListNode head){
		
		ListNode slow =head;
		ListNode fast = head;
		if(head==null){
			return null;
		}
		if(head.next==null){
			return head;
		}
		
		while( fast!=null && fast.next!=null ){
			slow = slow.next;
			fast = fast.next.next;
		}
		
		return slow;
		
		
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
	         fifth.next= sixth;
	         sixth.next = seventh;
	         seventh.next = eighth;
	        eighth.next = ninth;
		
	        return start;
		}
	
	

}
