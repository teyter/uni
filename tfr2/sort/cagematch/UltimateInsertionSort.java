import edu.princeton.cs.algs4.*;

public class UltimateInsertionSort {
    public static void sort(int[] x) {
        while (!isSorted(x)) {
            int swap = 0;
            for (int i = 0; i < x.length-1; i++) {
                if (x[i] > x[i+1]) {
                    swap = x[i];
                    x[i] = x[i+1];
                    x[i+1] = swap;
                }
            }
        }
    }
    public static void show(int[] x) {
        // this for loop just prints the array
        for (int i = 0; i < x.length; i++)
            StdOut.print(x[i] + " ");
        StdOut.println();
    }
    public static boolean isSorted(int[] y) {
        int count = 0;
        for (int i = 0; i < y.length-1; i++) {
            if (y[i] > y[i+1]) count++;
        }
        if (count > 0) return false;
        return true;
    }
    public static void main(String[] args) {
        int[] a = StdIn.readAllInts();
        sort(a);
        //show(a);
    }
}
