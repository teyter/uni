public class RecSpegil {
    public static boolean prec(int[] a, int i, int j) {
        if (a.length == 0 || a.length == 1) return true;
        if (i >= j) return true;
        if (a[i] != a[j]) return false;
        
        return prec(a, i + 1, j - 1);
    }
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 2, 1 };
        int b[] = { 1, 2, 3, 4, 5 };
        System.out.println(prec(a, 0, a.length-1));
        System.out.println(prec(b, 0, a.length-1));
    }
}

