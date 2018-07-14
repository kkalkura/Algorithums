package sample.singleLinkedList;



import java.util.Stack;

public class SumofNumbersSolution2 {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(5);//new listnode(2);
        list1.next = new ListNode(6);
        list1.next.next =  new ListNode(9);
        list1.next.next.next =  new ListNode(3);
        ListNode list2 = new ListNode(5);//new listnode(2);
        list2.next = new ListNode(6);
        list2.next.next =  new ListNode(9);
        list2.next.next.next =  new ListNode(3);
       printNodes(list1);
        System.out.println();
        printNodes(list2);
       //   ListNode list2 = new ListNode(1)
        ListNode list3 = addNumbers(list1, list2);
        System.out.println();
        printNodes(list3);
        //  ListNode results = mergeTwoLists(list1,list2);



    }

    public static void printNodes(ListNode Node) {

        while (Node != null) {
            System.out.print(Node.val + "->");
            Node = Node.next;
        }
    }
    
    private static int getNumber(ListNode list1){
        
    	int number =0;
    	while(list1!=null){
    		number = number*10 + list1.val;
    		list1 = list1.next;
    	}
    	return number;
       
    }
    
    
 private static ListNode addNumbers(ListNode list1,ListNode list2){
        
    	int number1 = getNumber(list1);
    	int number2 = getNumber(list2);
    	int result = number1+number2;
    	return convertNumbertoLinkList(result);
    }
    
 
    
    
 private static ListNode convertNumbertoLinkList(int Number){
	 ListNode resultsLinkList = null;
	 ListNode digitNode = null;
	   	int results = Number;
	   	int reverse =0;
	 while( results != 0 )
     {
         reverse = reverse * 10;
         reverse = reverse + results%10;
         results = results/10;
     }

   	while(reverse>0){
   		int digit = reverse%10;
   		ListNode digits = new ListNode(digit);
   			if(resultsLinkList==null){
   				resultsLinkList = digits;
   				digitNode = digits;
   			} else {
   				
   				digitNode.next= digits;
   				digitNode = digitNode.next;
   			}
   	
   			reverse = reverse/10;
   	}
   	return resultsLinkList;
 }
    

   
       
    	
    	
       
    
}

