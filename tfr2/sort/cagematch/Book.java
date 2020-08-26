public class Book {
    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j++)
                    exch(a, j, j-1);
        }
    }
    public static boolean less(int v, int w) {
        return v < w;
    }
    public static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
