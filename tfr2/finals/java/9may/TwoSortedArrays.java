import edu.princeton.cs.algs4.StdOut;

public class TwoSortedArrays {
    public static void print(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) StdOut.print(b[i] + " " + a[i] + " ");
            else if (a[i] < b[i]) StdOut.print(a[i] + " " + b[i] + " ");
            else StdOut.print(a[i] + " " + b[i] + " ");
        } StdOut.println();
    }
    public static void main(String[] args) {
        int [] a = {1,1,1,1,2};
        int [] b = {1,2,3,4,5};
        print(a,b);
    }
}
