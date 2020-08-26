public class DoubleNode {
    private static Node first;
    private static Node last;
    private static int size;
    
    public DoubleNode() {
        size = 0;
    }
    public static class Node {
        String data;
        Node next;
        Node prev;

        public Node(String data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }
    public static int size() {
        return size;
    }
    public static boolean isEmpty() {
        return size == 0;
    }
    public static void print(Node x) {
        for (x = x; x != null; x = x.next) {
            System.out.println( x.data );
        }
    }
    public static void pushFirst(String data) {
        Node temp = new Node(data, first, null);
        if (first != null) first.prev = temp;
        first = temp;
        if (last == null) last = temp;
        size++;
    }
    public static void main(String[] args) {
        DoubleNode.first = new Node("oskar", last, null);
        DoubleNode.last = new Node("viktor", null, first);
        print(first);
        DoubleNode.pushFirst("fok");
        System.out.println();
        print(first);
        
    }
}
