package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;

public class ReverseaLinkedList  extends SingleLinkedList {

	
	public static void main(String[] args){
		ReverseaLinkedList list = new ReverseaLinkedList();
        list.printNodes();
     //   ListNode result = list.reverseLinkedList(list.constructLinkedList());
         ListNode result = list.reverseLinkedListNtimes(list.constructLinkedList(), 3);
      
        System.out.println("After reversing the node");
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
	 
	 
	 
	
	public ListNode reverseLinkedList(ListNode head){
		if(head==null){
			return null;
		}
		ListNode current = head;
		ListNode prev = null;
		int count =0; 
		while(current!=null ){
			ListNode next = current.next;
			current.next = prev;
			prev =current;
			current = next; 
		}
		
	
		
		return prev;
	
	}
	
	public void printNodes(ListNode node1) {
    	ListNode start = node1;
        while (start != null) {   	
 	            System.out.print(start.val + "->");
        	 start = start.next;
        	
           
        }
    }
	
	
	// working code please igore other code
	
	public ListNode reverseLinkedListNtimes(ListNode head, int counter ){
		
		 System.out.println("reverseLinkedListNtimes");
		if(head==null){
			return null;
		}
		ListNode current = head;
		ListNode prev = null;
		ListNode next =null;
		int count =0;
	
		while(current!=null&& count < counter ){
			next = current.next;
			current.next = prev;
			prev =current;
			current = next;
			count ++;
		}
		
		if(next!=null) {
			head.next = reverseLinkedListNtimes(next,counter);
		}
		
		return prev;
	
	}
}
