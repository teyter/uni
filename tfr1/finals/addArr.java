public class addArr {
    public static void addTo(int[] a, int b) {
       for (int i = 0; i < a.length; i++) {
            a[i] += b;
            StdOut.print(a[i] + " ");
       } StdOut.println();
    }
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        int b = Integer.parseInt(args[0]);
        addTo(a, b);
    }
}
