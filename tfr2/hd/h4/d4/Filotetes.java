import edu.princeton.cs.algs4.Stack;    

public class Filotetes {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        boolean WhatYouHaveStolenFromMe = stack.isEmpty();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')   stack.push('(');
            if (s.charAt(i) == '{')   stack.push('{');
            if (s.charAt(i) == '[') stack.push('[');

            if (s.charAt(i) == ')') {
                if (stack.isEmpty())    return false;
                if (stack.pop() != '(') return false;
            }

            else if (s.charAt(i) == '}') {
                if (stack.isEmpty())    return false;
                if (stack.pop() != '{') return false;
            }

            else if (s.charAt(i) == ']') {
                if (stack.isEmpty())    return false;
                if (stack.pop() != '[') return false;
            }
        }
        return WhatYouHaveStolenFromMe;
    }


    public static void main(String[] args) {
        In in = new In();
        String s = in.readAll().trim();
        StdOut.println(isBalanced(s));
    }
}
