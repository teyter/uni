public class GenRand {
    public static void rand(int N) {
        for (int i = 0; i < N; i++)
            System.out.println( (int)(Math.random()*100000) );
    }
    public static void main(String[] args) {
        int N = Integer.parseInt( args[0] );
        rand(N);
    }
}
