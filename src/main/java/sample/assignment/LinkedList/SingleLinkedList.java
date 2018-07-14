package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;


public class SingleLinkedList {
	
	 private ListNode head;
	 
	// public static void ma
	 
	 
	 public ListNode getHead() {
		return head;
	}

	public SingleLinkedList() {
		super();
		head= constructLinkedList();
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

	public static void main(String[] args){
	        SingleLinkedList list = new SingleLinkedList();
        list.printNodes();
	       //611106
	        
	       ListNode result= list.findKthNodefromEnd(list.getHead(),5);
	       if(result!=null){
	    	   System.out.println("The value is "+result.val);
	    	   
	       }
	       	    }
	
	
	public  ListNode findKthNodefromEnd(ListNode head, int pos){
		if(head==null){
			return null;
		}
		
		ListNode p = head;
		int counter = pos ;
		while(counter>0 && p!=null){
			
				p = p.next;
			
			counter--;
		}
		if(p==null){
			return null;
		}
		
		ListNode q = head;
		
		while(p!=null){
			p=p.next;
			q= q.next;
		}
		
		return q;
	}
	 
	 public void printNodes() {
	    	ListNode start = head;
	        while (start != null) {   	
	 	            System.out.print(start.val + "->");
	        	 start = start.next;
	        	
	           
	        }
	    }
	 
	 public ListNode constructLinkedList(){
			
			ListNode   start =  new ListNode(1);
	        ListNode first = new ListNode(1);
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
	 

}
