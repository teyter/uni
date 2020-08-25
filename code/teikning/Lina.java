import edu.princeton.cs.algs4.*;

public class Lina {
    public static void main(String[] args) {
        double x;
        int z = 300;
        StdDraw.setCanvasSize(900, 900);
        StdDraw.setXscale(0,3);
        StdDraw.setYscale(0,3);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.01);
        for (int i = 0; i < z*3; i++) {
            x = (double)i/z;
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.point(x,x);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.point(x,x*x);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.point(x,Math.log(x));
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.point(x,x*Math.log(x));
        }
    }
}
