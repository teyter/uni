import edu.princeton.cs.algs4.*;

public class Random {
    public static void main(String[] args) {
        double[] q = new double[2];
        q[0] = 1.0;
        q[0] = 0.0;
        for (int i = 0; i < 10; i++) {
            int xx = (int)(Math.random()*7);
            double x = (double)xx/10;

            int yy = (int)(Math.random()*6)+5;
            double y = (double)yy/10;

            StdOut.printf("(%.1f, %.1f) ", x, y);
        } StdOut.println();
    }
}
