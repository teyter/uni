/**
 * 1.3.26 Write a method remove() that takes a linked list and a string
 * key as arguements and removes all of the nodes that has the key
 * in the item field
 */
import edu.princeton.cs.algs4.StdOut;

public class RemoveNode {

    String data;
    Node next;

    public static void printNode(Node x) {
        for (x = x; x != null; x = x.next) {
            StdOut.println( x.data );
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

    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node last = new Node();

        first.data = "knorrig";
        second.data = "teiti";
        third.data = "ramsey";
        last.data = "josie";

        first.next = second;
        second.next = third;
        third.next = last;

        //printNode( first );
        //String juggernaut = args[0];
        StdOut.println( first.data );
        String juggernaut = "knorrig";
        remove(first, juggernaut);
        StdOut.println( first.data );
        //StdOut.println("\nAfter the snap:");
        //printNode( first );
    }
}
