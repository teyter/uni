import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdOut;

public class RemoveOdds {
    public static void removeOdds(Stack<Integer> stack) {
        Stack<Integer> kock = new Stack<Integer>();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            int x = stack.pop();
            if (x % 2 == 0) {
                kock.push(x);
            } 
        }
        while (!kock.isEmpty()) {
            stack.push( kock.pop() );
        } StdOut.println(stack);
    }
    public static void reverseStack(Stack<Integer> stack) {

        Queue<Integer> que = new Queue<Integer>();
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 20; i > 0; i--) {
            stack.push(i);
        }
        StdOut.println(stack);
        removeOdds(stack);
    }
}
