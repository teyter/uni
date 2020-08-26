import edu.princeton.cs.algs4.*;

public class ManualBubble {
    public static int[] sort(int[] x) {
        int swap = 0;
        for (int i = 0; i < x.length-1; i++) {
            if (x[i] > x[i+1]) {
                swap = x[i];
                x[i] = x[i+1];
                x[i+1] = swap;
            }
        }
        // this for loop just prints the array
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
        char staf = 'y';
        int[] a = sort(random);
        int[] b = new int[random.length];
        while (staf != 'n') {
            StdOut.println("Sort again? (y/n)");
            staf = StdIn.readChar();
            b = sort(a);
            a = sort(b);
        }
    }
}