 package sample.assignment.LinkedList;

import java.util.Stack;

import sample.singleLinkedList.ListNode;

public class SumofTwoNumbersStack   extends SingleLinkedList {
	
	public static void main(String[] args){
		SumofTwoNumbersStack list = new SumofTwoNumbersStack();
        list.printNodes();
        ListNode result = list.SumofNumbers(list.constructLinkedList(),list.constructLinkedList2());
        
        System.out.println("After Swapping the nodes");
        list.printNodes(result);  	 
        	 
       
    }
	
	
	public ListNode SumofNumbers(ListNode head1,ListNode head2){

		if(head1==null && head2==null) {
			return null;
		}
		
		ListNode reveese1 = head1;
		ListNode reveese2 = head2;
		
		Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(reveese1!=null){
            s1.push(reveese1.val);
            reveese1 = reveese1.next;
        }

        while(reveese2!=null){
            s2.push(reveese2.val);
            reveese2 = reveese2.next;
        }
        int Sum=0, carry=0;
        ListNode current = null;
        while(!s1.empty() || !s2.empty()) {
        	Sum= (s1.isEmpty()?0:s1.pop())+ (s2.isEmpty()?0:s2.pop())+carry;
        	System.out.println("Sum is "+Sum);
            carry = Sum/10;
            Sum = Sum %10;
            ListNode result = new ListNode(Sum);
            result.next = current;
            current = result;
        	
        }
        
        if(carry>0){
			ListNode result = new ListNode(Sum);
			result.next = current;
			current = result;
			
		}
        
     //   ListNode finalresult = reverseLinkedList(current);
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
