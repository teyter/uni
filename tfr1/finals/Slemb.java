public class Slemb {
    public static int slam(int m, int n) {
        int z = n - m;
        int rand = m + (int)(Math.random()*z); // [m, n)
        return rand;    
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        for (int i = 0; i < 20; i++) {
            StdOut.print(slam(N, M) + " ");
        }
        StdOut.println();
    }
}
