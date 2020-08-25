public class Klemma {
    public static void main(String[] args) {
        double lo = Double.parseDouble(args[0]);
        double hi = Double.parseDouble(args[1]);

        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            if (value < lo) StdOut.println("Out: " + lo);
            else if (value > hi)      StdOut.println("Out: " + hi);
            else                 StdOut.println("Out: " + value);
        }
    }
}
/* Input:
 * java Klemma 2.0 9.0
 * 5.0 1.5 12.0 8.0
 * Output:
 * 5.0 2.0 9.0  8.0
 */
