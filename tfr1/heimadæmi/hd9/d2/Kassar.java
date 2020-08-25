public class Kassar {
    public static int thriKassar(int n) {
        if (n == 0) return 0;
        else        return n + thriKassar(n-1);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(thriKassar(n));
    }
}

