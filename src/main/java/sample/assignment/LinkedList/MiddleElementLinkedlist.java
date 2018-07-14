package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;

public class MiddleElementLinkedlist {
	 private ListNode head;
	   
	   public ListNode getHead() {
	        return head;
	    }

	    public void setHead(ListNode head) {
	        this.head = head;
	    }
	
	public static void main(String[] argument){
		System.out.println("Inside main");
		MiddleElementLinkedlist list = new MiddleElementLinkedlist();
		ListNode   start =  new ListNode(9);
        list.setHead(start);
        ListNode first = new ListNode(8);
        ListNode second = new ListNode(7);
        ListNode third = new ListNode(5);
        ListNode forth = new ListNode(6);
        start.next= first;
        first.next= second;
        second.next= third;
        third.next= forth;
        list.printNodes(start);
        System.out.println();
	}
	
	public ListNode middleElement(ListNode head){
		
		if(head==null){
			return null;
		}
		
		ListNode p =head;
		ListNode q = head;
		
		while(q!=null && q.next!=null){
			p = p.next;
			q = q.next.next;
		}
		return p;
	}




public void printNodes(ListNode start) {
    
    while (start != null) {
        System.out.print(start.val + "->");
        start = start.next;
    }
}
}
