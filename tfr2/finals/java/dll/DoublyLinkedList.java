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
    public Node find(String target) {
        for (Node x = first; x != null; x = x.next) {
            if ( x.data.equals(target) )
                return x;
        } return null;
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
        } else {
            last.next = temp;
            temp.prev = last;
            last = temp;
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
    public void insertBefore(String data, String givenNode) { // insert before given node
        Node temp = new Node(data);
        Node given = find(givenNode);
        if ( given == null ) {
            StdOut.println("No such node");
            return;
        } else if (given.prev == null) {
            insertAtB(data);
        } else {
            given.prev.next = temp;
            temp.next = given;
        }
    }
    public void insertAfter(String data, String givenNode) {
        Node temp = new Node(data);
        Node given = find(givenNode);
        if ( given == null ) {
            StdOut.println("No such node");
            return;
        } else if (given.next == null) {
            insertAtE(data);
        } else {
            temp.next = given.next;
            given.next = temp;
        }
    }
    public void removeGiven(String data) {
        Node dusted = find(data);
        if ( dusted == null )
            StdOut.println("No such node");
        else if (dusted.prev == null)
            removeB();
        else if(dusted.next == null)
            removeE();
        else
            dusted.prev.next = dusted.next;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtB("Gomorrah");
        dll.insertAtB("Dodo");
        dll.print();

        //StdOut.println("\nSnap!\n");
        //dll.print();
    }
}
