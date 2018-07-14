package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;



public class OddEvenLinkedList {
	
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
	 
	 public static void main(String[] args){
		 OddEvenLinkedList odd = new OddEvenLinkedList();
		odd.head = odd.constructLinkedList();
		 odd.printNodes();
		 odd.oddEvenList(odd.head);
		 System.out.println("After converting");
		 odd.printNodes();
	 }
	 
	 public void printNodes() {
	    	ListNode start = head;
	        while (start != null) {   	
	 	            System.out.print(start.val + "->");
	        	 start = start.next;
	        	
	           
	        }
	    }
	 
	 public ListNode oddEvenList(ListNode head) {
	        int count = 1;
			ListNode p, oddhead = null, evenhead = null, odd = null, even = null;
			p = head;
	        if(head==null){
	            return null;
	        }

			while (p  != null) {
				if (count % 2 == 1) {
					if (oddhead == null) {
						oddhead = p;
						odd = p;
					} else {
						odd.next = p;
						odd = odd.next;
					}
				} else {
					if (evenhead == null) {
						evenhead = p;
						even = p;
					} else {
						even.next = p;
						even = even.next;
					}

				}

				count++;
				p = p.next;
			}
	        
	        if(even!=null){
	             even.next =  null; 
	        }
	        
	        if(odd!=null){
	            	odd.next = evenhead;
	        }
	        
			
	     
			return oddhead;

	        
	    }

}
