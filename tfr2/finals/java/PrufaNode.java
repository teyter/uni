import edu.princeton.cs.algs4.StdOut;

public class PrufaNode {

    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node last = new Node();

        first.data = "knorrig";
        second.data = "teiti";
        third.data = "ramsey";
        last.data = "josie";

        first.prev = null;
        second.prev = first;
        third.prev = second;
        last.prev = third;

        first.next = second;
        second.next = third;
        third.next = last;
        last.next = null;

        first.insertE("emily", first);
        first.printNode(first);
    }
}