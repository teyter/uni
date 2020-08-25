public class Gafur {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int P = 1;
            for (int i = 0; i < N; i++) {
                P += i;
                System.out.println(P);
            }
    }
}
