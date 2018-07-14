package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;

public class SwappingPairs   extends SingleLinkedList {
	
	public static void main(String[] args){
		SwappingPairs list = new SwappingPairs();
        list.printNodes();
        ListNode result = list.Swappairs(list.constructLinkedList());
        
        System.out.println("After Swapping the nodes");
        list.printNodes(result);  	 
        	 
       
    }
	
	
	public ListNode Swappairs(ListNode head){
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode Iterator = dummy;
		
		if(head==null && head.next==null){
			return null;
		}
		
		while(Iterator.next!=null && Iterator.next.next!=null){
			
			ListNode startPair = Iterator.next;
			ListNode endPair = Iterator.next.next;
			ListNode nextPair = Iterator.next.next.next;
			
			endPair.next = startPair;
			startPair.next = nextPair;
			Iterator.next = endPair;
			Iterator = startPair;
			
			
			
		
		}
		return dummy.next;
		
		
	}
	
	
	
	
	 public ListNode constructLinkedList(){
			
			ListNode   start =  new ListNode(1);
	        ListNode first = new ListNode(2);
	        ListNode second = new ListNode(3);
	        ListNode third = new ListNode(4);
	        ListNode forth = new ListNode(4);
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
