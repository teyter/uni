public class javUTM {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[][] a = new int[N][N];
        for (int i = 0; i <= N-1; i++) {
            for (int j = 0; j <= N-1; j++) {
                if (i == 0 && j == 0)
                    a[i][j] = 1;
                else {
                    a[i][j] = 1/(i + j);
                    System.out.print(a[i][j] + " ");
                }
            } System.out.println();
        }
    }
}
