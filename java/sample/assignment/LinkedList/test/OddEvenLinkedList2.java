package sample.assignment.LinkedList.test;

import sample.singleLinkedList.ListNode;



public class OddEvenLinkedList2 {
	
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
	 
	 
	 public void printNodes() {
	    	ListNode start = head;
	        while (start != null) {   	
	 	            System.out.print(start.val + "->");
	        	 start = start.next;
	        	
	           
	        }
	    }
	 
	 public ListNode oddEvenList(ListNode head) {
	     ListNode p,oddHead = null,evenHead = null,odd = null,even = null;
	     
	     int count = 1;
	     if(head==null){
	    	 return null;
	     }
	     
	     p = head;
	     while(p!=null){
	    	 
	    	 if(count %2 ==1){
	    		 if(oddHead ==null){
	    			 oddHead =p;
	    			 odd = p;
	    		 } else{
	    			 odd.next =p;
	    			 odd = odd.next;
	    		 }
	    	 }	else {
	    			 if(evenHead ==null){
		    			 evenHead =p;
		    			 even = p;
		    		 } else{
		    			 even.next =p;
		    			 even = even.next;
		    		 }
	    			 
	    		 }
		     	count++;
				p = p.next;
	    	 }
	     if(even!=null){
	    	 even.next = null;
	     }
	     if(odd!=null){
         	odd.next = evenHead;
     }
	     return oddHead;
	 }
	
}
