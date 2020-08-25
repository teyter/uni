public class Nhrop {
    public static int halafact(int n) {
        return hjalp(n,1);
    }
    public static int hjalp(int n, int x) {
        if (n == 0) return x;
        return hjalp(n -1, n*x);
    }
    public static void main(String[] args) {
        int x = Integer.parseInt( args[0] );
        System.out.println( halafact(x) );
    }
}
