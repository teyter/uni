public class ForSquares {
    public static void main(String[] args) {
        int r = 0;
        int g = 0;
        int b = 0;
        double x = 0.1;
        for (int i = 0; i <= 8; i++) {
                r = (int)(Math.random()*256);
                g = (int)(Math.random()*256);
                b = (int)(Math.random()*256);
            if (i % 2 == 0) {
                StdDraw.setPenColor(r,g,b);
                StdDraw.filledSquare(x,.5,.05);
                x += 0.1;
            } else {
                StdDraw.setPenColor(r,g,b);
                StdDraw.filledSquare(x,.5,.05);
                x += 0.1;
            }
        }
    }
}
