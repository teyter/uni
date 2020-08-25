public class Fibword {
    public static String FibOrdRec(int n) {
        String a = "a";
        String b = "b";
        if (n == 1) return b;
        if (n == 2) return a;
        return FibOrdRec(n-1) + FibOrdRec(n-2);
    }
    public static String FibOrd(int n) {
        String a = "a";
        String b = "b";
        String c;
        if (n == 1) return b;
        if (n == 2) return a;
        for (int i = 2; i < n; i++) {
            c = a;
            a += b;
            b = c;
        }
        return a;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.println("Endurkvæmt:");
        System.out.println(FibOrdRec(n));
        System.out.println("Óendurkvæmt:");
        System.out.println(FibOrd(n));
    }
}

