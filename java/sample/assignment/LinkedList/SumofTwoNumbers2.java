package sample.assignment.LinkedList;

import java.util.Stack;

import sample.singleLinkedList.ListNode;

public class SumofTwoNumbers2   extends SingleLinkedList {
	
	public static void main(String[] args){
		SumofTwoNumbers2 list = new SumofTwoNumbers2();
        list.printNodes(list.constructLinkedList());
        System.out.println("----");
        list.printNodes(list.constructLinkedList2());
        int result = list.SumofNumbers(list.constructLinkedList(),list.constructLinkedList2());
        System.out.println("After Swapping the nodes"+result);
        list.printNodes(convertNumbertoLinkList(result));
     
      	 
        	 
       
    }
	
	
	public int SumofNumbers(ListNode head1,ListNode head2){

		if(head1==null && head2==null) {
			return 0;
		}
		
		ListNode reveese1 = head1;
		ListNode reveese2 =  head2;
		
	
        int Sum=0,temp=0;;
        ListNode current = null;
        while(reveese1!=null || reveese2!=null) {
        	int exp1=0;
        	int exp2=0;
        	if(reveese1!=null){
        		exp1 = reveese1.val;
        		
        	}
        	
        	if(reveese2!=null){
        		exp2 = reveese2.val;
        		
        	}
        	
        	
        	temp= (exp1+ exp2);
        	 ListNode result = new ListNode(temp);
              result.next = current;
              current = result;
        	Sum = Sum *10 + temp;
        	
        	
        	
        	System.out.println("Sum is "+Sum);
        	System.out.println("Temp is "+temp);
           
          
            if(reveese1!=null){
            	  reveese1 = reveese1.next;
            }
            if(reveese2!=null){
            reveese2 = reveese2.next;
            }
        }
        
       
        
        
  //      ListNode finalresult = reverseLinkedList(current);
        return Sum;
		
		
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
	
	
	private static ListNode convertNumbertoLinkList(int Number){
		 ListNode resultsLinkList = null;
		 ListNode digitNode = null;
	   	int results = Number;
	   	while(results>0){
	   		int digit = results%10;
	   		ListNode digits = new ListNode(digit);
	   			if(resultsLinkList==null){
	   				resultsLinkList = digits;
	   				digitNode = digits;
	   			} else {
	   				
	   				digitNode.next= digits;
	   				digitNode = digitNode.next;
	   			}
	   	
	   		results = results/10;
	   	}
	   	return resultsLinkList;
	      
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
	      //  ListNode third = new ListNode(4);
	      //  ListNode forth = new ListNode(5);
	      //  ListNode fifth = new ListNode(6);
	      //  ListNode sixth = new ListNode(7);
	      //  ListNode seventh = new ListNode(8);
	   //     ListNode eighth = new ListNode(9);
	   //     ListNode ninth = new ListNode(10);
	        
	        start.next= first;
	        first.next= second;
	     //   second.next= third;
	     //   third.next =forth;
	     //   forth.next = fifth;
	     //   fifth.next= sixth;
	     //   sixth.next = seventh;
	   //     seventh.next = eighth;
	  //      eighth.next = ninth;
		
	        return start;
		}
	 
	 
	 public ListNode constructLinkedList2(){
			
			ListNode   start =  new ListNode(1);
	        ListNode first = new ListNode(2);
	        ListNode second = new ListNode(3);
	    //    ListNode third = new ListNode(4);
	    //    ListNode forth = new ListNode(5);
	    //    ListNode fifth = new ListNode(6);
	    //    ListNode sixth = new ListNode(7);
	    //    ListNode seventh = new ListNode(8);
	    //    ListNode eighth = new ListNode(9);
	  //      ListNode ninth = new ListNode(10);
	        
	        start.next= first;
	        first.next= second;
	 //       second.next= third;
	//        third.next =forth;
	//        forth.next = fifth;
	//        fifth.next= sixth;
	//        sixth.next = seventh;
	//        seventh.next = eighth;
	  //      eighth.next = ninth;
		
	        return start;
		}
	 
	 
	 

}
