import edu.princeton.cs.algs4.StdOut;

public class SelectionSort {
    public static int[] sort(int[] x) {
        int swap = 0;
        for (int j = 0; j < x.length-1; j++) {
            int iMin = j;
            for (int i = j+1; i < x.length; i++)
                if (x[i] < x[iMin])
                    iMin = i;
            if (iMin != j) {
                swap = x[j];
                x[j] = x[iMin];
                x[iMin] = swap;
            }
        } 
        for (int i = 0; i < x.length; i++)
            StdOut.print(x[i] + " ");
        StdOut.println();
        return x;
    }
    public static void main(String[] args) {
        int N = 0; // initialize N-length of array
        while ( N < 10 ) // make sure length is at least 10
            N = (int)(Math.random()*51); // length can be at most 50
        int[] random = new int[N];
        for (int i = 0; i < random.length; i++)
            random[i] = (int)(Math.random()*10);
        for (int i = 0; i < random.length; i++)
            StdOut.print(random[i] + " ");
        StdOut.println();
        sort(random);
    }
}
