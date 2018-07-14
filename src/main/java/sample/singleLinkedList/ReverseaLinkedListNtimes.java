package sample.singleLinkedList;

public class ReverseaLinkedListNtimes {
	
	 private ListNode head;
	   
	   public ListNode getHead() {
	        return head;
	    }

	    public void setHead(ListNode head) {
	        this.head = head;
	    }
	    
	    
	    public static void main(String[] args){
	    	ReverseaLinkedListNtimes list = new ReverseaLinkedListNtimes();
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
		        ListNode reversed=  list.reverse(list.getHead());
		        list.printNodes(reversed);
		}
	    
	    public void printNodes(ListNode start) {
	        
	        while (start != null) {
	            System.out.print(start.val + "->");
	            start = start.next;
	        }
	    }
	    
	 public ListNode reverse(ListNode head){
		 
		 ListNode temp = null,Next =null;
		 Next = head.next;
		 
		 while(head!=null){
			 Next =head.next;
			 head.next = temp;
			 temp=head;
			 head = Next;
		 }
		 
		 return temp;
	 }

}
