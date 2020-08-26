import edu.princeton.cs.algs4.StdOut;

public class Selection {
    public static void sort(int[] a) {
        int swap = 0;
        int len = a.length;
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++) {
                if ( a[i] < a[j] ) {
                    swap = a[i];
                    a[i] = a[j];
                    a[j] = swap;
                }
            }
        // this for loop just prints the array
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();

    }
    public static boolean isSorted(int[] y) {
        int count = 0;
        for (int i = 0; i < y.length-1; i++)
            if (y[i] > y[i+1]) count++;
        if (count > 0) return false;
        return true;
    }
    public static void main(String[] args) {
        int N = 0; // initialize N-length of array
        while ( N < 10 ) // make sure length is at least 10
            N = (int)(Math.random()*41); // length can be at most 50
        int[] random = new int[N];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int)(Math.random()*10);
            StdOut.print( random[i] + " ");
        } StdOut.println('\n');

        sort(random);
    }
}
