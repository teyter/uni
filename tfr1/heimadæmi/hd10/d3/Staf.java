public class Staf {
    public static int snuaStofum(int n) {
        int snu = 0;
        while (n != 0) {
            int num = n % 10;
            snu = snu * 10 + num;
            n /= 10;
        } 
        return snu;
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.println(snuaStofum(N));
    }
}

