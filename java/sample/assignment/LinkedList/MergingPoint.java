package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;

public class MergingPoint   extends SingleLinkedList {
	
	public static void main(String[] args){
		MergingPoint list = new MergingPoint();
        list.printNodes();
       ListNode result = list.mergingPoint(list.constructLinkedListpair1(),list.constructLinkedListpair2());
        
        System.out.println("After Swapping the nodes");
    //    list.printNodes(result);  	 
        	 
       
    }
	
	
	
	 public ListNode mergingPoint(ListNode head1,ListNode head2){
		 
		 if(head1==null || head2==null){
			 return null;
		 }
		 
		 int  l1 =0;
		 ListNode temp1 = head1;
		 while(temp1.next!=null){
			 l1++;
			 temp1 = temp1.next; 
		 }
		 
		 ListNode temp2 = head2;
		 int  l2 =0;
		 while(temp2.next!=null){
			 l2++;
			 temp2 = temp2.next; 
		 }
		 ListNode p=null;
		 ListNode q =null;
		 int diff=0;
		 if(l1>l2){
			 diff = l1-l2;
			 p = head1;
			 q = head2;
		 }else {
			 diff = l2-l1;
			 p = head2;
			 q = head1;
		 }
		 
		 while(diff==0){
			 p = p.next;
			diff --;
		 }
		 
		 while(p!=null && q!=null & p.next!=null && q.next!=null && p.next!=q.next){
			 p = p.next;
			 q= q.next;
		 }
		 
		 return q.next;
		 
		 
		 
		 
	 }
	
	
	
	
	 public ListNode constructLinkedListpair1(){
			
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
	 
	 
	 
	 public ListNode constructLinkedListpair2(){
			
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
