public class Fok {
    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = a;
        b[0] = 2;
        StdOut.println(a[0] + ", " + b.length);
    }
}
