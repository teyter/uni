public class Trimjob {
    public static double trmean(double[] a) {
        double trim = StdStats.mean(a);
        double max = StdStats.max(trim);
        double min = StdStats.min(trim);
        trmean = (trim*a.length)/
        return trmean;
    }
    public static void main(String[] args) {
        double[] a = new double[10];
        StdOut.println("Fylki: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random()*11.0;
            StdOut.printf("%.4f\n", a[i]);
        }
        double mean = StdStats.mean(a);
        double klippt = trmean(a);
        StdOut.printf("Average: %.4f\n", mean);
        StdOut.printf("TrimMean: %.4f\n", klippt);
    }
}
