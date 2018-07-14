package sample.singleLinkedList;

public class OddEvenLinekdList {
	   private ListNode head;
	   
	   public ListNode getHead() {
	        return head;
	    }

	    public void setHead(ListNode head) {
	        this.head = head;
	    }
	
	public static void main(String[] args){
		OddEvenLinekdList list = new OddEvenLinekdList();
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
	        ListNode sorted=  list.oddEvenlist(list.getHead());
	       list.printNodes(sorted);
	}
	
	public ListNode oddEvenlist(ListNode head) {
		int count = 1;
		ListNode p, oddhead = null, evenhead = null, odd = null, even = null;
		p = head;

		while (p  != null) {
			if (count % 2 == 1) {
				if (oddhead == null) {
					oddhead = p;
					odd = p;
				} else {
					odd.next = p;
					odd = odd.next;
				}
			} else {
				if (evenhead == null) {
					evenhead = p;
					even = p;
				} else {
					even.next = p;
					even = even.next;
				}

			}

			count++;
			p = p.next;
		}
		even.next =  null;

		odd.next = evenhead;
		return oddhead;

	}
	
	

    public void printNodes(ListNode start) {
      
        while (start != null) {
            System.out.print(start.val + "->");
            start = start.next;
        }
    }

}
