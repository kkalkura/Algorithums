package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;

public class ReorderaList2  extends SingleLinkedList {
	
	public static void main(String[] args){
		ReorderaList2 list = new ReorderaList2();
        list.printNodes(list.constructLinkedList());
        list.reOrderList(list.constructLinkedList());     
       
       
    }

	public void reOrderList(ListNode head1){
		
		if(head1==null || (head1.next==null)){
			return ;
		}
		
		ListNode slow =head1;
		ListNode fast = head1;
		ListNode temp= head1;
		ListNode previous= null;
		ListNode secondHalf = null;
		while( fast!=null && fast.next!=null ){
			previous = slow;
			slow = slow.next;		
			fast = fast.next.next;
		}
		 
		secondHalf = slow;
		previous.next = null;
    	
      ListNode current = secondHalf;
		ListNode prev = null;
		while(current!=null){
			ListNode next = current.next;
			current.next = prev;
			prev =current;
			current = next;
		}
		ListNode temp2= temp.next;
		ListNode temp3 = prev;
	    
		while(temp2!=null && temp3!=null){
			temp.next = temp3;
			temp3 = temp3.next;
			temp = temp.next;
			temp.next = temp2;
			temp2 = temp2.next;
			temp = temp.next;
			}
		if(temp3!=null) {
			temp.next = temp3;
		}

	}
	
	
	public void printNodes(ListNode node1) {
    	ListNode start = node1;
        while (start != null) {   	
 	            System.out.print(start.val + "->");
        	 start = start.next;
        	
           
        }
    }
	
	
	
	
	public ListNode reverseLinkedList(ListNode head){
		if(head==null){
			return null;
		}
		ListNode current = head;
		ListNode prev = null;
		while(current!=null){
			ListNode next = current.next;
			current.next = prev;
			prev =current;
			current = next;
		}		
    	return prev;
	}
	
	
	public void alternate(ListNode head1, ListNode head2){
		ListNode pointer = head1;
		boolean nextList1 = false;
		head1 = head1.next;
		
		while(head1!=null || head2!=null){
			if((head2!=null && nextList1==false) || (head1==null)){
				pointer.next = head2;
				head2.next = head2;
				nextList1=true;
			}else{
				pointer.next = head1;
				head1.next = head1;
				nextList1=false;
			}
			
		}
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
	     //   fifth.next= sixth;
	     //   sixth.next = seventh;
	     //   seventh.next = eighth;
	      //  eighth.next = ninth;
		
	        return start;
		}

}
