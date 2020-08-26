import edu.princeton.cs.algs4.*;

public class Teljari {
    public static void Tel(Counter t) {
        t.increment();
        t.increment();
    }
    public static void main(String[] args) {
        Counter c = new Counter("Klukka");
        c.increment();
        Tel(c);
        int tally = c.tally();
        StdOut.println("Tally: " + tally);
    }
}
