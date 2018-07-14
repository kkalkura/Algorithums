package sample.assignment.LinkedList;

import sample.singleLinkedList.ListNode;

public class ReorderaList  extends SingleLinkedList {
	
	public static void main(String[] args){
		ReorderaList list = new ReorderaList();
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
		ListNode temp1= head1;
		while( fast!=null && fast.next!=null ){
			slow = slow.next;		
			fast = fast.next.next;
		}
		
		ListNode secondHalf = slow.next;
    	//System.out.println("Printing the first half");
    //	System.out.println("****************");
     //   printNodes(temp);
		//System.out.println("After the middle node");
     //  printNodes(secondHalf);
       
      ListNode current = secondHalf;
		ListNode prev = null;
		while(current!=null){
			ListNode next = current.next;
			current.next = prev;
			prev =current;
			current = next;
		}
		
		slow.next = null;
		
	//	System.out.println("After the reversing node ******");
	//	 printNodes(prev);
		 
	//	 System.out.println("The original list ******");
	//	 printNodes(temp);
		 boolean first= false;
		 ListNode finalNode = null;
		 ListNode finalHead = null;
		
		 if(finalHead==null){				
			 finalNode = new ListNode(temp.val);
			 finalHead = finalNode;
			 temp1 = temp1.next;
			
		 } 
	 
		 while(prev!=null){
			 
			 if(first==false){
				 finalNode.next =new ListNode(prev.val);
				 prev = prev.next;
				 first =true;
			 } else {
				 finalNode.next =new ListNode(temp1.val);  	
				 temp1 =temp1.next; 						
				 first =false;			 
			 }
			 finalNode =  finalNode.next;
		//	 temp =  temp.next;
            }
		 while(temp1!=null){
			 finalNode.next =new ListNode(temp1.val);  	
			 temp1 =temp1.next;
			 finalNode =  finalNode.next;
			 
		 }
		 
		 System.out.println("Final Results ******");
		 printNodes(finalHead);
		 
		
		
		
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
	    //     third.next =forth;
	    //    forth.next = fifth;
	     //   fifth.next= sixth;
	     //   sixth.next = seventh;
	     //   seventh.next = eighth;
	      //  eighth.next = ninth;
		
	        return start;
		}

}
