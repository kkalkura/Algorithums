package sample.singleLinkedList;

public class SingleLinkedList {

    private ListNode head;

    public void insertNodeintheStart(int data){
    	ListNode temp = new ListNode(data);
        temp.next = head;
        head = temp;
    }

    public void inseetNodeAtgivenPosition(int pos,int data){
        if(pos==1){
        	ListNode temp = new ListNode(data);
            temp.next = head;
            head=temp;
            return;

        }
        ListNode p =head;
        for(int i=1;i<pos-1;i++){
            p = p.next;
        }

        if(p!=null){
        	ListNode temp = new ListNode(data);
            temp.next = p.next;
            p.next = temp;

        }


    }

    public void inseetAfterNodeAtgivenNode(int data,int newValue){
    	ListNode p =head;
       while(p!=null){
           if(p.val==data){
               break;
           }
           p=p.next;
       }
       if(p!=null) {
    	   ListNode temp = new ListNode(newValue);
           temp.next = p.next;
           p.next = temp;
       }else {
           System.out.println("Not able to find a Node");
       }

    }

    public void deleteAfterNodeAtgivenNode(int data){
    	ListNode p = head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.val==data){
            head = head.next;
            return;
        }

        // One step before loop not normal stuff
        while(p.next!=null){
            if(p.next.val==data){
                break;
            }
            p= p.next;

        }

        if(p.next!=null){
            p.next=p.next.next;
        }else{
            System.out.println("Can not find the Node");
        }


        }

      public void deleteatGivenPosition(int pos){
        if(head==null){
            System.out.println("Head is null");
        }
        if(pos==1){
            head = head.next;


            return;
        }

        ListNode p = head;
        for(int i=1;i<pos-1;i++) {
            if(p!=null) {
                p = p.next;
            }
        }
        if(p!=null){
            p.next = p.next.next;
        }else{
            System.out.println("Not able to find the position");
        }
      }


    public void inseetBeforeNodeAtgivenNode(int data,int newValue){
    	ListNode p =head;
        if(head==null){
            return;
        }
        if(data==head.val){
        	ListNode temp = new ListNode(newValue);
            temp.next= head;
            head=temp;
            return;

        }
        while(p!=null){
            if(p.next.val==data){
                break;
            }
            p=p.next;
        }
        if(p!=null) {
        	ListNode temp = new ListNode(newValue);
            temp.next = p.next;
            p.next = temp;
        }else {
            System.out.println("Not able to find a Node");
        }

    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public void printNodes() {
    	ListNode start = head;
        while (start != null) {
            System.out.print(start.val + "->");
            start = start.next;
        }
    }


    public static void main(String[] args){
        SingleLinkedList list = new SingleLinkedList();


        ListNode   start =  new ListNode(9);
        list.setHead(start);
        ListNode first = new ListNode(8);
        ListNode second = new ListNode(7);
        ListNode third = new ListNode(5);
        start.next= first;
        first.next= second;
        second.next= third;
        third.next =null;
        list.printNodes();
        System.out.println();
        //list.inseetAfterNodeAtgivenNode(9,90);
      //  list.insertNodeintheStart(13);
      //  list.inseetBeforeNodeAtgivenNode(9,90);
        list.inseetNodeAtgivenPosition(5,89);

   //     list.printNodes();
    //    list.deleteAfterNodeAtgivenNode(7);
       System.out.println();
        list.printNodes();
        list.deleteatGivenPosition(5);
        System.out.println();
        list.printNodes();
    }


}
