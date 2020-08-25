public class Prof2a {
    public static void main(String[] args) {
        int j = 1;
        StdOut.print(j + " ");
        for (int i = 1; j <= 100; i++) {
            if (i%2 == 1 && i != 1) {
                j += i;
                StdOut.print(j + " ");
            }
        } StdOut.println();
    }
}
