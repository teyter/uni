import edu.princeton.cs.algs4.StdOut;

public class Random {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            StdOut.println( (int)(Math.random()*10) );
        }
    }
}
