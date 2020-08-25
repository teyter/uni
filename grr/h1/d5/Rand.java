import edu.princeton.cs.algs4.*;

public class Rand {
    public static void main(String[] args) {
        int N = 10;
        for (int i = 0; i < N; i++) {
            StdOut.print(
                    (int)(Math.random()*100) + " "
                    );
        } StdOut.println();
    }
}
