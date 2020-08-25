import edu.princeton.cs.algs4.StdOut;

public class Michael {
    public static boolean isPalin(int n) {
        int snu = 0;
        int org = n;
        while (n != 0) {
            int num = n % 10;
            snu = snu * 10 + num;
            n /= 10;
        } return org == snu;
    }
    public static void main(String[] args) {
        int max = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                if (isPalin(i*j) && i*j > max)
                    max = i*j;
            }
        } StdOut.println(max);
    }
}
