package sample.singleLinkedList;

public class ReverseaLinkedList {
	
	//head->next = temp
	// temp = head 
	
	// head =next
	// next = head-> next
	
	
	 private ListNode head;
	   
	   public ListNode getHead() {
	        return head;
	    }

	    public void setHead(ListNode head) {
	        this.head = head;
	    }
	    
	    
	    public static void main(String[] args){
	    	ReverseaLinkedList list = new ReverseaLinkedList();
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
		        ListNode reversed=  list.reverseSizeK(list.getHead(),4);
		        list.printNodes(reversed);
		}
	    
	    public void printNodes(ListNode start) {
	        
	        while (start != null) {
	            System.out.print(start.val + "->");
	            start = start.next;
	        }
	    }
	    
	 public ListNode reverseSizeK(ListNode head,int k){
		 
		 ListNode temp = null,Next =null;
		 Next = head.next;
		 int count=0;
		 
		 while(head!=null && count<k){
			 head.next = temp;
			 temp=head;
			 head = Next;
			 if(head!=null){
			 Next =head.next;
			 }
			 count++;
		 }
		 if(Next!=null) {
			 head.next = reverseSizeK(Next,k);
		 }
		 
		 return temp;
	 }

}
