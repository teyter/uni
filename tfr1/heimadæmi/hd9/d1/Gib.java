public class Gib {
    public static String gob(int n) {
        String a = "b";
        String b = "a";
        String c;
        for (int i = 2; i < n; i++) {
            c = b;
            b += a;
            a = c;
        } return b;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(gob(n));
    }
}

