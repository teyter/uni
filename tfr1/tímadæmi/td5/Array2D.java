public class Array2D {
    public static void main(String[] args) {
        int M = Integer.parseInt(args[0]);
        int N = Integer.parseInt(args[1]);

        boolean[][] roca = new boolean[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                roca[i][j] = (boolean)(Math.random()>0.5);
            }
        }
        for (int k = 0; k < M; k++) {
            for (int l = 0; l < N; l++) { 
                if (roca[k][l]) {
                    System.out.print("*");
                } else 
                    System.out.print("_");
            }
            System.out.println();
        }
    }
}
