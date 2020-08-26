import edu.princeton.cs.algs4.StdOut;

public class DoublyLinkedList {
    public Node first;
    public Node last;

    private static class Node {
        public String data;
        public Node next;
        public Node prev;

        public Node(String data) {
            this.data = data;
        }
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void print() {
        for (Node x = first; x != null; x = x.next) {
            if (x.next == null) {
                StdOut.print(x.data);
            } else {
                StdOut.print(x.data + " <-> ");
            }
        } StdOut.println();
    }
    public void insertAtB(String data) { // insert at beginning
        Node temp = new Node(data);
        if ( isEmpty() ) {
            last = temp;
        } else {
            first.prev = temp;
        }
        temp.next = first;
        first = temp;
    }
    public void insertAtE(String data) { // insert at end
        Node temp = new Node(data);
        if (isEmpty()) {
            last = temp;
            temp.next = first;
            first = temp;
       }
       else if (last == null) {
            last = temp;
        } else {
            last.next = temp;
            temp.prev = last;
        }
    }
    public void removeB() { // remove from beginning
        if ( isEmpty() ) return;
        else if (first == null) return;
        else {
            first = first.next;
        }
    }
    public void removeE() { // remove from the beginning
        if ( isEmpty() ) return;
        else {
            last = last.prev;
            last.next = null;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtE("Tyler");
        dll.insertAtE("Bobo");
        dll.insertAtE("Knorrig");
        dll.print();

        //StdOut.println("\nSnap!\n");
        //dll.print();
    }
}
