public class Hrop {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int i, j;
        for (i = 1, j = 1; i <= N; i++) {
            j *= i;
        } StdOut.println(j); // 1 + 2 + ... + 10
    }
}
