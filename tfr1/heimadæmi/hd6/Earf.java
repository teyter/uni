public class Earf {
    public static void main(String[] args) {
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();
        // position
        double rx = 0.480, ry = 0.860;
        // velocity
        double vx = 0.015, vy = 0.023;
        double radius = 0.01;
        while (true) {
            if (Math.abs(rx + vx) + radius > 1.0) { 
                vx = -vx;
                StdAudio.play("laser.wav");
            }
            if (Math.abs(ry + vy) + radius > 1.0) { 
                vy = -vy;
                StdAudio.play("pop.wav");
            }
            rx += vx;
            ry += vy;
            StdDraw.clear();
            StdDraw.picture(rx,ry,"earf.gif");
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}
