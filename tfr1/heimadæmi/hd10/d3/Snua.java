public class Snua {
    public static int snuaStofum(int n) {
        System.out.println("N mod " + n + " 10 = " + n % 10);
        System.out.println("N div " + n + " 10 = " + n / 10);
        return 0;
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        snuaStofum(N);
    }
}

