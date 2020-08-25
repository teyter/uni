public class RecStaf {
    public static int snuaStofum(int n) {
        int snu = 0;
        if (n == 0) return 0;
            int num = n % 10;
            snu = snu * 10 + num;
            return snuaStofum(n)/10;
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println(snuaStofum(N));
    }
}

