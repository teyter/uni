public void removeLastNode() {
    if ( isEmpty()) return;
    else if (head == null) return;
    else {
        for (Node x = head; x != null; x = x.xnext) {
            if (x.next.next == null) x.next = null;
        }
    }
}
