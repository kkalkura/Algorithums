package sample.singleLinkedList;

public class AdditionUtility {

	
	public static void main(String[] args){
		
		int number = 123456;
		ListNode result=  convertNumbertoLinkList(number);
		printNodes(result);
	}
	
	public static void printNodes(ListNode Node) {

        while (Node != null) {
            System.out.print(Node.val + "->");
            Node = Node.next;
        }
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
}
