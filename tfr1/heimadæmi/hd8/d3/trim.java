public class trim {
    public static double trmean(double[] a) {
        return 0;
    }
    public static void main(String[] args) {
        double[] a = new double[10];
        StdOut.println("Fylki: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random()*11.0;
            StdOut.printf("%.4f\n", a[i]);
        }
        double mean = StdStats.mean(a);
        double max = StdStats.max(a);
        double min = StdStats.min(a);
        int counter = 0;
        double[] klippt = new double[a.length-2];
        System.out.println("TrimFylki: ");
        // Trimma fylkid
        for (int i = 0; i < a.length; i++) {
            if (a[i] != max && a[i] != min) {
                klippt[counter] = a[i];
                counter++;
                System.out.println(klippt);
            } 
        }
        // endTrimma fylkid
        double trmean = StdStats.mean(klippt);
        StdOut.printf("Average: %.4f\n", mean);
        StdOut.printf("TrimMean: %.4f\n", trmean);
        StdOut.printf("Max: %.4f\nMin: %.4f\n", max, min);
    }
}
