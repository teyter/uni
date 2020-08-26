public static boolean find(String key) {
    if (isEmpty()) return false;
    if (head == null) return false;
    for (x = x; x != null; x = x.next) {
        if (x.data == key) return true;
    }
    return false;
}
