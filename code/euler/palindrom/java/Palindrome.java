import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Palindrome {
    public static boolean isPalin(Stack<Integer> s, Stack<Integer> t) {
        int size = s.size();
        for (int i = 0; i < size; i++) {
            if ( s.pop() != t.pop() )
                return false;
        }
        return true;
    }
    public static Stack<Integer> reverseStack(Stack<Integer> s) {
        Stack<Integer> t = new Stack<Integer>();
        int size = s.size();
        for (int i = 0; i < size; i++) {
            t.push( s.pop() );
        }
        return t;
    }
    public static void main(String[] args) {
        int x = 1234;
        Stack<Integer> s = new Stack<Integer>();
        while (x != 0) {
            s.push(x % 10);
            x /= 10;
        }
        Stack<Integer> t = reverseStack(s);
        StdOut.println( s );
        StdOut.println( t );
    }
}
