public class Maur {
    public static void main(String[] args) {
        int M = 7;
        int N = 8;
        int A[][] = new int[M][N];
        init.array(A,M,N);
        init.print(A,M,N);
        int i = M/2;
        int j = 1;
        for (; j < N-1; i+=0) {
            for (; j < N-1; j+=0) {
                init.print(A,M,N);
                A[i][j] = 9;
                if (A[i-1][j+1] == 1) {
                    i -= 1;
                    j += 1;
                    break;
                }
                if (A[i+1][j+1] == 1) {
                    i += 1;
                    j += 1;
                    break;
                }
                if (A[i][j+1] == 1) {
                    j += 1;
                    break;
                }
if (A[i+1][j+1] == 0 && A[i][j+1] != 1 && A[i-1][j+1] != 1) { 
    
    j+=1; 

}
            }
        }
    }
}
