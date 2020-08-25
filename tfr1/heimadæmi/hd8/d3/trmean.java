public class trmean {
    public static double trmean(double[] a) {
        double max = StdStats.max(a);
        double min = StdStats.min(a);
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        sum = sum - max - min;
        double trmean = sum/8; 
        return trmean;
    }
    public static void main(String[] args) {
        double a[] = new double[10];
        StdOut.println("Fylki: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random()*11.0;
            StdOut.printf("%.4f\n", a[i]);
        }
        double mean = StdStats.mean(a);
        double trim = trmean(a);

        StdOut.printf("Vengulegt meðaltal: %.4f\n", mean);
        StdOut.printf("Klippt meðaltal: %.4f\n", trim);
    }
}

