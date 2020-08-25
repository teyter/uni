public class MatrixTriangle {
    public static void main(String[] args) {
        int N = 5;
        double x[][] = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                x[i][j] = 0.0;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j <= i; j++) {
                x[i][j] = 1;
            } x[i][j] = 0;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(x[i][j]+" ");
            } System.out.println();
        }
    }
}
