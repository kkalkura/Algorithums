package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;

public class RemoveNthElementfromEnd  extends SingleLinkedList {

	
	public static void main(String[] args){
		RemoveNthElementfromEnd list = new RemoveNthElementfromEnd();
        list.printNodes();
        ListNode result = list.removenthNodefromEnd(list.constructLinkedList(), 2);
      
        System.out.println("After removig the node");
        list.printNodes(result);  	 
       
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
	      //  first.next= second;
	       //  second.next= third;
	        // third.next =forth;
	        //forth.next = fifth;
	        //fifth.next= sixth;
	     //   sixth.next = seventh;
	     //   seventh.next = eighth;
	     //   eighth.next = ninth;
		
	        return start;
		}
	 
	 
	 
	
	public ListNode removenthNodefromEnd(ListNode head, int pos){
		if(head==null){
			return null;
		}
		
		ListNode p = head;
		ListNode dummy = head;
		ListNode q = head;
		int counter = pos ;
		while(counter>0 && p!=null){
				p = p.next;
				counter--;
		    	
		}
		// we have reached the end 
		if(p==null && counter>0){
			return dummy;
		}
		if(p==null && counter<=0){
			dummy = dummy.next;
			return dummy;
		}
		
		while(p.next!=null){
			p=p.next;
			q= q.next;
		}
		
		q.next=q.next.next;
		
		return dummy;
		
		 
		
		
	}
}
