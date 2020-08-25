public class Point2d2 {
    public double x;
    public double y;

    public Point2D() {
        x = 0.0;
        y = 0.0;
    }

    public double getX() {
        return x;
    }

    public double setX(double inx) {
        x = inx;
    }

    public static void main(String[] args) {
        Point2D p = new Point2D();
        p.x = 2.0;
        p.y = 1.0;
    }
}       
