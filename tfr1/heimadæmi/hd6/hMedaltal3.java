public class hMedaltal3 {
    public static void main(String[] args) {
        double t1 = StdIn.readDouble();
        double t2 = StdIn.readDouble();
        double t3 = StdIn.readDouble();

        while (!StdIn.isEmpty()) {
            t1 = t2;
            t2 = t3;
            t3 = StdIn.readDouble();

            StdOut.println( (t1+t2+t3)/3.0 );
        }
    }
}
