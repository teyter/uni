import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stopwatch;
import java.util.Arrays;

public class Sorted {

    private static void gaur(int[] x, int[] y) {
        int i = 0;
        int j = 0;
        while(i < x.length && j < y.length) {
            while(i < x.length && x[i] < y[j]) {
                i++;
            }
            if (i < x.length && j < y.length && x[i] == y[j]) {
                System.out.print(x[i] + " ");
                i++;
                j++;
            }
            while(i < x.length && j < y.length && y[j] < x[i]) {
                j++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] x = in.readAllInts();
        Arrays.sort(x);
        in = new In(args[1]);
        int[] y = in.readAllInts();
        Arrays.sort(y);

        Stopwatch time = new Stopwatch();
        gaur(x, y);
        System.out.println(time.elapsedTime());
    }


}
