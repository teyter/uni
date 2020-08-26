import edu.princeton.cs.algs4.StdOut;

public class GenNum {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        for (int i = 0; i < N; i++) {
            StdOut.println( (int)(Math.random()*2000000)-1000000);
        }
    }
}
