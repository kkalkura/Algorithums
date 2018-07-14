package sample.singleLinkedList;



import java.util.Stack;

public class SumofNumbers {

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

    private static ListNode addNumbers(ListNode list1, ListNode list2){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(list1!=null){
            s1.push(list1.val);
            list1 = list1.next;
        }

        while(list2!=null){
            s1.push(list2.val);
            list2 = list2.next;
        }

        int carry=0,Sum=0;
        ListNode current = null;
        while(!s1.empty() || !s2.empty()){
            Sum= (s1.isEmpty()?0:s1.pop())+ (s2.isEmpty()?0:s2.pop())+carry;
            Sum = Sum %10;
            carry = Sum/10;
            System.out.println("Sum Values is"+ Sum);
            System.out.println("Carry Values is"+ carry);
            ListNode result = new ListNode(Sum);
            result.next = current;
            current = result;
        }
        if(carry>0){

            ListNode result = new ListNode(Sum);
            result.next = current;
            current = result;

        }
        return current;
    }
}

