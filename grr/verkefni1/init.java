public class init {
    public static void array(int A[][], int M, int N) {
        int i;
        int j;
        for (i = 0; i < M; i++) {
            for (j = 0; j < N; j++) {
                A[i][j] = 0;
            }
        }
        A[1][3] = 1;
        A[2][2] = 1;
        A[4][4] = 1;
        A[5][1] = 1;
        A[5][5] = 1;
        A[5][6] = 1;
    }
    public static void print(int A[][], int M, int N) {
        int i;
        int j;
        for (i = 0; i < M; i++) {
            for (j = 0; j < N; j++) {
                System.out.print( A[i][j] + " " );
            } System.out.println();
        } System.out.println();
    }
}
