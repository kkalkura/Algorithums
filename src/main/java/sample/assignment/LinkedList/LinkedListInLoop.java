package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;

public class LinkedListInLoop  {
	ListNode  head =null;
	
	public static void main(String[] args){
		LinkedListInLoop list = new LinkedListInLoop();
		int[] input = {0,1,2,3,4,5,6,7};
       list.head =  constructLinkedList(input);
       list.printNodes();
	       	 
       
    }
	
	 public void printNodes() {
	    	ListNode start = head;
	        while (start != null) {   	
	 	            System.out.print(start.val + "->");
	        	 start = start.next;
	        	
	           
	        }
	    }
	

	
	
	 public static ListNode constructLinkedList(int[] input){
		 ListNode start =null ,head = null;
		
		 for(int i=0;i<input.length-1;i++){
			 if(head==null){
				 start = new ListNode(input[i]);
				 head = start;
				
			 } else {
				 start.next = new ListNode(input[i]);
				 start = start.next;
			 }
			
		 }
		 
		 return head;
			
			
		
	        
		}
	
	

}
