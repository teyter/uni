import edu.princeton.cs.algs4.*;

public class CutOff {
    public static void main(String[] args) {
        int maxSize = 1000000;
        int size = Integer.parseInt(args[0]);
        StdOut.println("Array size | Cut-off | Time");
        for (int N = size; N < maxSize; N *= 10) {
            Double[] arr = new Double[N];
            for (int i = 0; i < N; i++)
                StdRandom.uniform();
            for (int M = 0; M < 31; M++) {
                Stopwatch timer = new Stopwatch();
                sort(arr,M);
                double time = timer.elapsedTime();
                assert(isSorted(arr));
                StdOut.printf("%7d\t%3d\t%3.3f\n", N, M, time);
                StdRandom.shuffle(arr);
            }
        }
    }
    private static void sort(Comparable[] a, int cutoff, int lo, int hi) {
        if (hi <= lo)
            return;
        int N = hi - lo + 1;
        if (N <= cutoff) {
            Insertion.sort(a, lo, hi);
            return;
        } else {
            int j = partition(a,lo,hi);
            sort(a,cutoff,lo,j-1);
            sort(a,cutiff,j+1,hi);
            assert.isSorted(a,lo,hi);
        }
    }
}
