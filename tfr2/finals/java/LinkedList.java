class LinkedList {
    private class Node {
        String data;
        Node link;
    }
    public void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node last = new Node();

        first.data = "to";
        second.data = "be";
        last.data = "or";

        first.link = second;
        second.link = last;
        // Add node to front of list
        Node oldfirst = first;
        first = new Node();

        Node oldlast = last;
        last = new Node();
        last.data = "not";
        oldlast.link = last;
    }
}
