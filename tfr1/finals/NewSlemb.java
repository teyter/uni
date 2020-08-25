public class NewSlemb {
    public static int[] slembifylki(int a, int b, int n) {
        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = a + (int)(Math.random()*((b-(a))+1));
            StdOut.print(m[i] + " ");
        } StdOut.println();
        return m;
    }
    public static void main(String[] args) {
        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);
        int N = Integer.parseInt(args[2]);
        slembifylki(A, B, N);
    }
}
