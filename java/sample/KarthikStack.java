package sample;


/**
 * Created by karthikkalkur on 02/09/17.
 */
public class KarthikStack<Item> {
    private int n;          // size of the stack
    private Node first;


    private class Node {
        private Item item;
        private Node next;

        public Node() {
            this.item = null;
            n = 0;
        }

        public void push(Item item) {
            Node oldfirst = first;
            Node newItem = new Node();
            newItem.item = item;
            newItem.next = oldfirst;
            n++;

        }

        public Item pop() {
            Item item = first.item;
            first = first.next;
            n--;
            return item;
        }
    }
}
