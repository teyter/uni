/*************************************************************************
 *  Einföld beinagrind fyrir tölvuleiknum Pong.
 *************************************************************************/
import java.awt.event.KeyEvent;
import edu.princeton.cs.algs4.*;

public class Pong {
    public static int randomColor() {
        return (int)(Math.random()*256);
    }
    public static double[] randomBox() {
        double[] xy = new double[4];
        int xx = (int)(Math.random()*11)-5;
        xy[0] = (double)xx/10;

        //int yy = (int)(Math.random()*6)+5; // only positive y axis
        int yy = (int)(Math.random()*11)-5;
        xy[1] = (double)yy/10;

        return xy;
    }
    public static void main(String[] args) {

        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

        // initial values of ball
        double rx = 0.480, ry = 0.860;     // position
        double vx = 0.015, vy = 0.023;     // velocity
        double radius = 0.05;              // radius

        // initial values of paddle
        double[] px = {-0.2, 0.2, 0.2, -0.2};
        double[] py = {-0.85, -0.85, -0.90, -0.90};
        //double[] py = {0.0, 0.0,-0.2,-0.2}; // paddle in the middle
        double dpx = 0.018;                 // inc. paddle movement

        // initial values of randomBox
        double[] xy = randomBox();
        double[] bx = { xy[0], xy[0]+0.4, xy[0]+0.4, xy[0] };
        double[] by = { xy[1], xy[1], xy[1]-0.05, xy[1]-0.05 };

        // main animation loop
        while (true)  {

            // print coordinates of paddle
            //StdOut.printf("Left: (%.2f, %.2f) Right: (%.2f, %.2f)\n", px[0], py[0], px[1], py[1]);

            // bounce ball off top and bottom of paddle
            if ( (rx + vx) > px[0] - radius &&
                 (rx + vx) < px[1] + radius &&
                 (ry + vy) < py[1] + radius &&
                 (ry + vy) > py[2] - radius ) { 
                    vy = -vy;
                 }
            // bounce ball of sides of paddle
//          if ( (rx + vx) > px[0] + radius &&
//               (rx + vx) < px[1] - radius && 
//               (ry + vy) < py[0] - radius &&
//               (ry + vy) > py[2] + radius ) { vx = -vx; }

            // bounce ball off top and bottom of randomBox
            if ( (rx + vx) > bx[0] - radius &&
                 (rx + vx) < bx[1] + radius &&
                 (ry + vy) < by[1] + radius &&
                 (ry + vy) > by[2] - radius ) { 
                    vy = -vy;
                    xy = randomBox();
                    bx[0] = xy[0];
                    bx[1] = xy[0]+0.4;
                    bx[2] = xy[0]+0.4;
                    bx[3] = xy[0];

                    by[0] = xy[1];
                    by[1] = xy[1];
                    by[2] = xy[1]-0.05;
                    by[3] = xy[1]-0.05;
                    StdDraw.setPenColor(StdDraw.GREEN);
                    StdDraw.filledPolygon(bx, by);
                 }
            // bounce ball off wall according to law of elastic collision
            if ( Math.abs(rx + vx) > 1.0 - radius ) {
                vx = -vx; // floor / ceiling
            }
            if ( Math.abs(ry + vy) > 1.0 - radius ) {
                vy = -vy; // walls
            }


            // update ball position
            rx = rx + vx;
            ry = ry + vy;

            // check if paddle moved
            if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT) && px[0]-dpx >= -1.0 )
                for (int i=0; i<4; i++)  px[i] -= dpx;
            if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT) && px[1]+dpx <= 1.0 )
                for (int i=0; i<4; i++)  px[i] += dpx;

            StdDraw.clear();

            // draw ball on the screen
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(rx, ry, radius);
            
            // test coordinates with green ball 
            //StdDraw.setPenColor(StdDraw.GREEN);
            //StdDraw.filledCircle(0.0,-0.5, radius);

            // draw paddle on the screen
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledPolygon(px, py);

            // draw randomBox on screen
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledPolygon(bx, by);

            // display and pause for 20 ms
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}
