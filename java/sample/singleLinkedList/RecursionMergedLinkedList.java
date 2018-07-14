package sample.singleLinkedList;

public class RecursionMergedLinkedList {


    public static ListNode mergeTwoListRecusively(ListNode l1, ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode mergeNode ;
        if(l1.val<l2.val){
            mergeNode = l1;
            mergeTwoListRecusively(l1.next,l2);
        } else {
            mergeNode =l2;
            mergeTwoListRecusively(l1,l2.next);
        }
        return mergeNode;
    }




    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
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


    public static void main(String[] args){

        ListNode list1 = new ListNode(45);//new listnode(2);
       list1.next = new ListNode(6);
       list1.next.next =  new ListNode(9);
        list1.next.next.next =  new ListNode(23);
        printNodes(list1);
        System.out.println();
       ListNode list2 = new ListNode(1);
        ListNode results = mergeTwoLists(list1,list2);
      //  ListNode list2 = mergeSort(list1);
       printNodes(results);

    }

    public static void printNodes(ListNode Node) {

        while (Node != null) {
            System.out.print(Node.val + "->");
            Node = Node.next;
        }
    }
}
