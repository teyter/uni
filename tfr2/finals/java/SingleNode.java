/**
 * 1.3.21 Write a method find() that removes the last node 
 * in a linked list whose first node is first
 */
import edu.princeton.cs.algs4.StdOut;

public class SingleNode {

    String data;
    Node next;

    public static boolean find(Node node, String key) {
        for (Node x = node; x != null; x = x.next) {
            if ( x.data.equals(key) ) return true;
        }
        return false;
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

        StdOut.println( find(first, "knorrig") );
    }
}
