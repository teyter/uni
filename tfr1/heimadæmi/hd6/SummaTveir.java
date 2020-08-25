public class SummaTveir {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        if (a + b == c || b + c == a || a + c == b)
            StdOut.println("Summa");
        else StdOut.println("Ekki summa");
    }
}
