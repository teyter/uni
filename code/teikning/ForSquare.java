import edu.princeton.cs.algs4.*;

public class ForSquare {
    public static int r() {
        return (int)(Math.random()*256);
    }
    public static int g() {
        return (int)(Math.random()*256);
    }
    public static int b() {
        return (int)(Math.random()*256);
    }
    public static void grid() {
        while (true) {
            for (double i = 0.0; i < 1.0; i+=0.1) {
                for (double j = Math.random(); j < 1.0; j+=0.1) {
                    StdDraw.setPenColor(r(),g(),b());
                    StdDraw.filledSquare(i,j,0.1);
                }
            }
        }
    }
    public static void main(String[] args) {
        StdDraw.setCanvasSize(900, 900);
        StdDraw.setPenColor(0,110,0);
        StdDraw.setPenRadius(0.01);
        grid();
    }
}
