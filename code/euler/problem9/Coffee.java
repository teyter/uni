import edu.princeton.cs.algs4.StdOut;

public class Coffee {
    public static void main(String[] args) {
        int n = 1000;
        for (int a = 1; a < n; a++)
            for (int b = 1; b < n; b++)
                for (int c = 1; c < n; c++) {
                    int a2 = (int)Math.pow(a,2);
                    int b2 = (int)Math.pow(b,2);
                    int c2 = (int)Math.pow(c,2);
                    if (a2 + b2 == c2 && a+b+c == n) {
                        StdOut.println("\na = " + a + "\nb = " + b + "\nc = " + c);
                        StdOut.println("\na*b*c = " + a*b*c);
                    }
                }
    }
}
