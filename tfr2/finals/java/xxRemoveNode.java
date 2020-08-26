import edu.princeton.cs.algs4.StdOut;

public class xxRemoveNode {

    private class Node {
        String data;
        Node next;
    }

    public static void printNode(Node x) {
        for (x = x; x != null; x = x.next) {
            StdOut.println( x.data );
        }
    }

    public static void remove(Node x, String key) {
        for (x = x; x.next != null; x = x.next) {
            if ( x.data.equals(key) )
                StdOut.println("First node contains key");
            if ( x.next.data.equals(key) && x.next.next == null ) 
                ;
                //x.next = null;
            else if ( x.next.data.equals(key) ) 
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

        printNode( first );
        String juggernaut = args[0];
        remove(first, juggernaut);
        StdOut.println("\nAfter the snap:");
        printNode( first );
    }
}
