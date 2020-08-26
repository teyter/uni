/**
 * Er bara að testa Stack<Item> úr bókinni
 */
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

@SuppressWarnings("unchecked")
public class StackFlip {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(5);
        s.push(7);
        for (int i : s)
            StdOut.print(i);
        StdOut.println();
    }
}
