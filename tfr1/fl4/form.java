public class form {
    public static void main(String[] args) {
        StdOut.printf("%10.2f\n", 1234.5678);
        StdOut.printf("%8f\n", 1234.5678);
        StdOut.printf("%6.4f\n", 1234.5678);

        double verd = 452.50;
        double afsl = 14.8;

        StdOut.printf("%10.2f,", verd);
        StdOut.printf("%3.0f%%", afsl);

    }
}
