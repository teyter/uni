public class Point2d {
    public double x;
    public double y;

    public Point2D() {
        x = 0.0;
        y = 0.0;
    }

    public static void main(String[] args) {
        Point2D p = new Point2D();
        p.x = 2.0;
        p.y = 1.0;
        Point2D r = p;
        r.x = 1.0; // Now p is also changed
    }              // p and r are references to the same 
}                  // object, we can change it through both references
                   // We should rather use a getter and setter
