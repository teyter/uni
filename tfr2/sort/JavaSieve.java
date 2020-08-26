public class JavaSieve {
    public static void main(String[] args) {
        int N = 20;
        int scalar = 0;
        int sqrtN = (int)Math.sqrt(N);
        int[] numbers = new int[N];
        boolean[] A = new boolean[N];
        // initialize arrays
        for (int i = 0; i < N; i++) {
            numbers[i] = i;
            A[i] = true;
        }
        for (int i = 2; i < sqrtN; i++) {
            if ( A[i] ) {
                for (int j = (i*i)+(scalar*i); j < N; j += (i*i)+(scalar*i)) {
                    A[j] = false;
                    scalar += 1;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("%b\t%d\n", A[i], numbers[i]);
        //    if ( A[i] )
        //        System.out.println( numbers[i] );
        }
    }
}
