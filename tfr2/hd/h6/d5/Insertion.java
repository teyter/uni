import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;

public class Insertion {
    public static boolean less(int v, int w) {
        return v.compareTo(w) < 0;

    }
    public static void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
        System.out.print(t + " ");
    }
    public static void sort(int[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
        }
    }
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] x = in.readAllInts();
        Stopwatch oskar = new Stopwatch();
        sort(x);
        System.out.println(oskar.elapsedTime());
    }
}
