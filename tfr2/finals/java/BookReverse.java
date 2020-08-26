/**
 * Testa Reverse ur bokini
 */
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;

public class BookReverse {
    public static void main(String[] args) {
        Stack<Integer> stack;
        stack = new Stack<Integer>();
        while ( !StdIn.isEmpty() )
            stack.push( StdIn.readInt() );
        for (int i : stack)
            StdOut.print(i + " ");
        StdOut.println();
    }
}
