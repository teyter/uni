public class Test {
    public static void bla(int[] a) {
        a[3] = 1;
    }
    public static void main(String[] args) {
        int[] b = { 0, 0, 0, 0 };
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
        bla(b);
        System.out.println("After: ");
        for (int i = 0; i < b.length; i++)
            System.out.println(b[i]);
    }
}
