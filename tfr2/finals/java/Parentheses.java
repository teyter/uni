import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

public class Parentheses {
    public static boolean sucka(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
                stack.push(s.charAt(i));

            if (s.charAt(i) == ']') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '[') return false;
            }
            else if (s.charAt(i) == '}') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '{') return false;
            }
            else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '(') return false;
            }
        } return stack.isEmpty();
    }
    public static void main(String[] args) {
        String dick = "[()]{}{[()()]()}";
        StdOut.println( sucka(dick) );
    }
}
