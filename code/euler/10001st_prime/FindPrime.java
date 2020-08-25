public class FindPrime {
    public static boolean isPrime(int N) {
        if (N == 0 || N == 1) return false;
        for (int i = 2; i < N; i++)
            if (N % i == 0) return false;
        return true;
    }
    public static void printPrime(int M) {
        int primeCount = 0;
        for (int i = 0; primeCount != M; i++) {
            if (isPrime(i)) {
                primeCount++;
                System.out.println(i + " is the " + primeCount + "th prime number");
            }
        }
    }
    public static void main(String[] args) {
        int B = Integer.parseInt( args[0] );
        printPrime(B);
    }
}
