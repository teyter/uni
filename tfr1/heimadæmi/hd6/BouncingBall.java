public class BouncingBall {
    public static void main(String[] args) {
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();
        // position
        double rx = 0.480, ry = 0.860;
        // velocity
        double vx = 0.015, vy = 0.023;
        double radius = 0.09;
        while (true) {
            if (Math.abs(rx + vx) + radius > 1.0) vx = -vx;
            if (Math.abs(ry + vy) + radius > 1.0) vy = -vy;
            rx += vx;
            ry += vy;

            StdDraw.clear();
            StdDraw.filledSquare(rx, ry, radius);

            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}
