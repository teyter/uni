public class ArrayBST {
    private int index;
    private int[] keys;
    private int[] left;
    private int[] right;
    private int nuthegar;
    public ArrayBST(int size) {
        keys = new int[size];
        left = new int[size];
        right = new int[size];
        nuthegar = 0;
    }
    public int get(int x) {
        return get(x, 0);
    }
    private Integer get(int x, int pos) {
        if (keys[pos] == x) return x;
        if (left[pos] == 0 && right[pos] == 0) return null;
        else if (x < keys[pos]) {
            if (left[pos] == 0) return null;
            return get(x, left[pos]);
        }
        else if (x > keys[pos]) {
            if (right[pos] == 0) return null;
            return get(x, right[pos]);
        }
        return null;
    }
    public void put(int x) {
        if (nuthegar == 1) {
            nuthegar = 0;
            return;
        }
        keys[index] = x;
        put(x, 0);
        index++;
    }
    private void put(int x, int pos) {
        if (keys[pos] == x) {
            nuthegar = 1;
            return;
        }
        if (x < keys[pos]) {
            if (left[pos] == 0) left[pos] = index;
            else put(x, left[pos]);
        }
        if (x > keys[pos]) {
            if(right[pos] == 0) right[pos] = index;
            else put(x, right[pos]);
        }
    }
}
