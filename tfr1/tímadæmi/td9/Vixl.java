public class Vixl {
    public static void printnum(int n) {
        if (n < 1) return;
        printnum(n-1);
        StdOut.println(n);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        printnum(n);
    }
}

