/**
 * Implement a nested class DoubleNode for building doubly linked lists
 * where each node contains a reference to the preceding item and the item
 * follwing it. Then implement static methods for the folliwing tasks:
 * insert at the beginning, insert at the end, remove from the beginning,
 * remove from the end, insert before/after a given node, remove a given node
 */
import edu.princeton.cs.algs4.StdOut;

public class Node {

    String data;
    Node prev;
    Node next;

    public void printNode(Node x) {
        for (x = x; x != null; x = x.next) {
            StdOut.println( x.data );
        }
    }

    public Node insertB(String newData, Node x) {
        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = x;
        newNode.prev = null; 
        return newNode;
    }

    public void insertE(String newData, Node x) {
        Node newNode = new Node();
        newNode.data = newData;
        for (x = x; x != null; x = x.next) {
            if (            
        }
    }

    public static void remove(Node x, String key) {
        while ( x.data.equals(key) && x != null )
            x = x.next;
        for (x = x; x != null; x = x.next) {
            while ( x.next != null && x.next.data.equals(key) )
                x.next = x.next.next;
        }
    }

}
