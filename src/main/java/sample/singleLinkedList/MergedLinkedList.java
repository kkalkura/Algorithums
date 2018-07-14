package sample.singleLinkedList;

public class MergedLinkedList {

  public  static ListNode mergeSort(ListNode list1) {
      if(list1==null || list1.next==null ){
          return list1;
      }
      ListNode start1 = list1;
      ListNode start2 = divideList(list1);
     start1 =   mergeSort(start1);
     start2 =  mergeSort(start2);
     ListNode startM =  mergeTwoLists( start1, start2);
     return startM;

  }


  public static ListNode divideList(ListNode list2){

      ListNode q = list2.next.next;
      while(q!=null && q.next!=null){
          list2= list2.next;
          q =q.next.next;
      }
      ListNode start2 = list2.next;
      list2.next = null;
      return start2;

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
     //   ListNode list2 = new ListNode(1);
      //  ListNode results = mergeTwoLists(list1,list2);
        ListNode list2 = mergeSort(list1);
        printNodes(list2);

    }

    public static void printNodes(ListNode Node) {

        while (Node != null) {
            System.out.print(Node.val + "->");
            Node = Node.next;
        }
    }
}
