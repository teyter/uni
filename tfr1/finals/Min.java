public class Min {
    public static double max(double[] a) {
        double max = Double.POSITIVE_INFINITY;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < max) max = a[i];
        } return max;
    }
    public static void main(String[] args) {
        double a[] = { 1.0, 2.0, 3.0, 3.5 };
        StdOut.println(max(a));
    }
}
