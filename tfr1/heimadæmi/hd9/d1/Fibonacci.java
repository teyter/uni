public class Fibonacci {
    public static void Fib(int lo, int hi) {
        int a = 0; int b = 1;
        for(int i = 0; i <= hi; i++) {
            if (a > lo && a < hi)
                System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        } System.out.println();
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        Fib(N,M);
    }
}
