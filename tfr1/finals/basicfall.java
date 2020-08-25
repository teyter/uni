public class basicfall {
    public static double mult2(double x) {
        return 2.0*x;
    }
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        StdOut.printf("%.1f\n", mult2(x));
    }
}
