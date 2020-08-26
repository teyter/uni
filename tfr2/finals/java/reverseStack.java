import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;
import java.util.Iterator;

@SuppressWarnings("unchecked")
public class reverseStack {
    public static void reverseStack(Stack<Integer> s) {
        Stack<Integer> t = new Stack<Integer>(); 
        int size = s.size();
        for (int i = 0; i < size; i++) {
            t.push( s.pop() );
        }
       StdOut.println("t: " + t);
    }
    public static void main(String[] args) {
       // Stack buinn til og gefinn 9 8 7 6 5 4 3 2 1
       Stack<Integer> s = new Stack<Integer>(); 
       for (int i = 0; i < 10; i++)
           s.push(i);
       StdOut.println("s: " + s);
       reverseStack(s);
    } 
}
