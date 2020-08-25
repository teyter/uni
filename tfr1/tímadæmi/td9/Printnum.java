public class Printnum {
    public static void printnum(int n) {
        if (n < 1) return;
        StdOut.println(n);
        n--;
        printnum(n);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        printnum(n);
    }
}

