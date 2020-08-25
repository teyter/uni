public class ProfH {
    public static void main(String[] args) {

        int[] a = {1, 0, 2};
        for (int i = 0; i < a.length; i++) {
            a[a[i]]++;
        }
        StdOut.println("a = " + a);
    }
}
