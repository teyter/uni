public static void main(String[] args) {
        // fyrsta array
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        Arrays.sort(a);
 
        // seinna array
        in = new In(args[1]);
        int[] b = in.readAllInts();
        Arrays.sort(b);
 
        Stopwatch timer = new Stopwatch();
        count_v2(a,b);
        double time = timer.elapsedTime();
        StdOut.printf("%d identical %f time\n",count,time);
 
    }
