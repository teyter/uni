import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdOut;

class TestaBag {
    static void printBag(Bag<Integer> b) {
        for (int i : b)
            StdOut.print(i + " ");
        StdOut.println();
    }

    static Bag<Integer> populateBag(Bag<Integer> b) {
        for (int i = 10; i > 0; i--) {
            b.add(i);
        }
        return b;
    }

    public static void main(String[] args) {
        Bag<Integer> b = new Bag<Integer>();
        b = populateBag(b);
        printBag(b);
        
    }
}
