/*************************************************************************
 *  Einföld beinagrind fyrir tölvuleiknum Pong.
 *
 *************************************************************************/
import java.awt.event.KeyEvent;
import edu.princeton.cs.algs4.*;

public class BouncingOlaf {
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
        double[] py = {-0.85, -0.85, -.90, -0.90};
        double dpx = 0.018;                 // inc. paddle movement

        // main animation loop
        while (true)  {

            // bounce ball off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

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
            //StdDraw.filledCircle(rx, ry, radius);
            StdDraw.picture(rx,ry,"Olaf.jpeg",0.5,0.5);

            // draw paddle on the screen
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledPolygon(px, py);
            
            // display and pause for 20 ms
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}
