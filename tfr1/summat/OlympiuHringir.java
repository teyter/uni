public class OlympiuHringir {
    public static void main(String []args) {
        StdDraw.setPenRadius(0.018);

        // Skuggi
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.circle(0.240, 0.554, 0.12);
        StdDraw.circle(0.51, 0.554, 0.12);
        StdDraw.circle(0.78, 0.554, 0.12);
        StdDraw.circle(0.375, 0.426, 0.12);
        StdDraw.circle(0.645, 0.426, 0.12); 

        //Efri Hringir
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.circle(0.23, 0.564, 0.12);
        
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.circle(0.5, 0.564, 0.12);
        
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.circle(0.77, 0.564, 0.12);
        
        // Neðri Hringir
        StdDraw.setPenColor(StdDraw.YELLOW);
        StdDraw.circle(0.365, 0.436, 0.12);
        
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.circle(0.635, 0.436, 0.12);
        
        // Intersections sem vantar
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.arc(0.23, 0.564, 0.12, 340.0, 0);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.arc(0.5, 0.564, 0.12, 340.0, 0);
        StdDraw.arc(0.5, 0.564, 0.12, 240, 265);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.arc(0.77, 0.564, 0.12, 240, 265);
    }
}