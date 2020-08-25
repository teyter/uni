public class DubSlemb {
    public static double[] slembifylki(double a, double b, int n) {
        double[] m = new double[n];
        for (int i = 0; i < n; i++) {
            m[i] = a + Math.random()*(b-a);
            StdOut.printf("%.1f ", m[i]);
        } StdOut.println();
        return m;
    }
    public static void main(String[] args) {
        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        int N = Integer.parseInt(args[2]);
        slembifylki(A, B, N);
    }
}
