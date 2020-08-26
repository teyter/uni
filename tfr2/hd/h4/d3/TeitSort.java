import edu.princeton.cs.algs4.Stack;

public class TeitSort {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();        
        String a = "4 3 2 1 0 9 8 7 6 5";     
        stack.push(a);
        while(!stack.isEmpty()) {
            StdOut.println(stack.pop());
        }
    }
}
