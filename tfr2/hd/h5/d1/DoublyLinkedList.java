/**
 * Class that declares instance variables next, data
 * @author Teitur Gudmundarson <teg6@hi.is>
 */
class Node {
    Node next;
    Node before;
    String data;
    /**
     * Node constructor
     * @param d
     */
    public Node(String d) {
        data = d;
    }
}
class DoublyLinkedList {
    Node head;
    public void insertAtBegin(String data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }
    public void insertAtEnd(String data) {
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
    public void removeFromBegin() {
        Node current = head;
        removeGiven(current.data);
        current = current.next;
    }
    public void removeFromEnd() {
        Node current = head;
        while (current.next != null) {
            if (current.next == null) {
                removeGiven(current.data);
                return;
            }
            current = current.next;
        }
    }
    public void removeBeforeGiven(String data) {
        if (head == null)
            return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.next.data == data) {
                current.next.next = current.next
                return;
            }
            current = current.before;
        }
    }
    public void insertBeforeGiven(String data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        if (head.data == data) {
            head = head.before;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.before;
                return;
            }
            current = current.before;
        }
    }
    public void insertAfterGiven(String data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != data) {
            if (current.next.data == data) {
                current.next = current.next;
                return;
            }
            current = current.next;
        }
    }
    public void removeGiven(String data) {
        if (head == null)
            return;
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
    public void removeGiven(String data) {
        if (head == null)
            return;
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
}
