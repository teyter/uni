public class trimbo {
    public static double trmean(double[] a) {
        double[] trim = new double[a.length-2];
        double max = StdStats.max(a);
        double min = StdStats.min(a);
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != max && a[i] != min) {
                trim[counter] = a[i];
                counter++;
            }  
        }
        return StdStats.mean(trim);
    }
    public static void main(String[] args) {
        double[] a = new double[10];
        StdOut.println("Fylki: " );
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random()*11.0;
            StdOut.printf("%.4f\n", a[i]);
        }
        double mean = StdStats.mean(a);
        StdOut.printf("Meðaltal: %.4f\n", mean);
        double trog = trmean(a);
        StdOut.printf("Klippt meðaltal: %.4f\n", trog);
    }
}

