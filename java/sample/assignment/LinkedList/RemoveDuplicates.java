package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;

public class RemoveDuplicates   extends SingleLinkedList {
	
	public static void main(String[] args){
		RemoveDuplicates list = new RemoveDuplicates();
        list.printNodes();
        ListNode result = list.removeDuplicate(list.constructLinkedList());
        
        System.out.println("After removig the duplicate nodes");
        list.printNodes(result);  	 
        	 
       
    }
	
	
	public ListNode removeDuplicate(ListNode node){
		ListNode head = node;
		
		if(head==null){
			return null;
		}
		
		ListNode p = head;
		ListNode q = head.next;
		ListNode dummy = head;
		ListNode dummy1 = head;
		while(p.next!=null & dummy!=null) {
			if(p.val==q.val){
				dummy1 = removeElement(dummy1,p.val);
				dummy1 = removeElement(dummy1,q.val);
			}
			p =p.next;
			q = q.next;	
			
		}
		
		dummy.next = dummy.next.next;
		
		return dummy1;
	}
	
	
	public ListNode removeElement(ListNode head,int data){
		
	    	ListNode p = head;
	        if(head==null){
	            System.out.println("list is empty");
	            return null;
	        }
	        if(head.val==data){
	            head = head.next;
	            return head;
	        }

	        // One step before loop not normal stuff
	        while(p.next!=null){
	            if(p.next.val==data){
	                break;
	            }
	            p= p.next;

	        }

	        if(p.next!=null){
	            p.next=p.next.next;
	        }else{
	           // System.out.println("Can not find the Node");
	        }
	        
	        return head;

	}
	
	 public ListNode constructLinkedList(){
			
			ListNode   start =  new ListNode(1);
	        ListNode first = new ListNode(1);
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
