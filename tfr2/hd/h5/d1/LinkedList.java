class Node {
    Node next;
    String data;
    public Node(String d) {
        data = d;
        next = null;
    }
}
class LinkedList {
    Node head;

    public void append(String data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }
    public void prepend(String data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    public void deleteWithValue(String data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    // code fragment that removes last node
    public void removeLastNode() {
        Node current = head;
        while (current.next != null) {
            if (current.next == null) {
                deleteWithValue(current.data);
                return;
            }
            current = current.next;
        }
    }

    public boolean find(String data) {
        Node current = head;
        while (current.data != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
