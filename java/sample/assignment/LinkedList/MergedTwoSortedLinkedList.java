package sample.assignment.LinkedList;

public class MergedTwoSortedLinkedList {
	
	public static void main(String[] args){
		System.out.println("Inside main");
	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode startNode=null;
        if(list1==null && list2==null){
            return null;
        }
        if(list1==null){
           startNode = new   ListNode(list2.val);
            list2 = list2.next;
        } else if (list2==null){
            startNode = new   ListNode(list1.val);
            list1 = list1.next;
        } 
        if(list1!=null && list2!=null) {
        if(list1.val<=list2.val){
            startNode = new ListNode(list1.val);
            list1 = list1.next;
        } else {
             startNode = new ListNode(list2.val);
            list2 = list2.next;           
        }
        }
        
        
        // Creating the start node
        
        ListNode mergedNode = startNode;
        
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
            mergedNode.next = new ListNode(list1.val);
            list1 = list1.next;
        } else {
             mergedNode.next = new ListNode(list2.val);
            list2 = list2.next;           
        }
           mergedNode = mergedNode.next; 
        }
        
         while(list1!=null){
           
            mergedNode.next = new ListNode(list1.val);
            list1 = list1.next;
             mergedNode = mergedNode.next; 
        } 
        while(list2!=null){
           
            mergedNode.next = new ListNode(list2.val);
            list2 = list2.next;
             mergedNode = mergedNode.next; 
        } 
        
        return startNode;
   
        
    }

}
