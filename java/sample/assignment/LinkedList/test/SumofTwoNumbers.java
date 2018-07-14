package sample.assignment.LinkedList.test;

import java.util.Stack;

import sample.assignment.LinkedList.SingleLinkedList;
import sample.singleLinkedList.ListNode;

public class SumofTwoNumbers   extends SingleLinkedList {
	
	public static void main(String[] args){
		SumofTwoNumbers list = new SumofTwoNumbers();
        list.printNodes(list.constructLinkedList());
        System.out.println("----");
        list.printNodes(list.constructLinkedList2());
        ListNode result = list.SumofNumbers(list.constructLinkedList(),list.constructLinkedList2());
        
        System.out.println("After Swapping the nodes");
        list.printNodes(result);  	 
        	 
       
    }
	
	
	public ListNode SumofNumbers(ListNode head1,ListNode head2){

		if(head1==null && head2==null) {
			return null;
		}
		
		ListNode reveese1 = reverseLinkedList(head1);
		ListNode reveese2 = reverseLinkedList(head2);
		
		ListNode current =null;
		 int Sum=0, carry=0;
		while(reveese1!=null || reveese2!=null){
			
			int exp1=0;
			int exp2=0;
			
			if(reveese1!=null){
				exp1 = reveese1.val;
			}
			if(reveese2!=null){
				exp2 = reveese2.val;
			}
			
			int total = exp1+exp2+carry;
			 Sum = total%10;
			 System.out.println("Sum is "+Sum);
			 carry = total/10;
			
			ListNode result = new ListNode(Sum);
			result.next = current;
			current = result;
			if(reveese1!=null){
				reveese1 = reveese1.next;
			}
			if(reveese2!=null){
				reveese2 = reveese2.next;
			}
			
		}
		
		if(carry>0){
			ListNode result = new ListNode(Sum);
			result.next = current;
			current = result;
			
		}
		
		return current;
		
	}
	
	
	public ListNode reverseLinkedList(ListNode head){
		if(head==null){
			return null;
		}
		ListNode current = head;
		ListNode prev = null;
		 
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
	
	
	
	
	 public ListNode constructLinkedList(){
			
			ListNode   start =  new ListNode(1);
	        ListNode first = new ListNode(2);
	        ListNode second = new ListNode(3);
	        ListNode third = new ListNode(4);
	        ListNode forth = new ListNode(5);
	        ListNode fifth = new ListNode(6);
	        ListNode sixth = new ListNode(7);
	        ListNode seventh = new ListNode(8);
	   //     ListNode eighth = new ListNode(9);
	   //     ListNode ninth = new ListNode(10);
	        
	        start.next= first;
	        first.next= second;
	        second.next= third;
	        third.next =forth;
	        forth.next = fifth;
	        fifth.next= sixth;
	        sixth.next = seventh;
	   //     seventh.next = eighth;
	  //      eighth.next = ninth;
		
	        return start;
		}
	 
	 
	 public ListNode constructLinkedList2(){
			
			ListNode   start =  new ListNode(1);
	        ListNode first = new ListNode(2);
	        ListNode second = new ListNode(3);
	        ListNode third = new ListNode(4);
	        ListNode forth = new ListNode(5);
	        ListNode fifth = new ListNode(6);
	        ListNode sixth = new ListNode(7);
	        ListNode seventh = new ListNode(8);
	        ListNode eighth = new ListNode(9);
	  //      ListNode ninth = new ListNode(10);
	        
	        start.next= first;
	        first.next= second;
	        second.next= third;
	        third.next =forth;
	        forth.next = fifth;
	        fifth.next= sixth;
	        sixth.next = seventh;
	        seventh.next = eighth;
	  //      eighth.next = ninth;
		
	        return start;
		}
	 
	 
	 

}
