public class TopCounter {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int A[][] = new int [N][N];
        int counter = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = (int)(Math.random()*10);
                System.out.print(A[i][j] + " "); 
            } System.out.println();
        } System.out.println();
        for (int i = 0; i < N; i++) {
          for (int j = 0; j < N; j++) {
            if (i != 0 && i != N-1 && j != 0 && j != N-1) {
                      if (A[i][j] > A[i-1][j] &&
                          A[i][j] > A[i][j-1] &&
                          A[i][j] > A[i+1][j] &&
                          A[i][j] >  A[i][j+1]) {
                        System.out.println(A[i][j] + " í línu (" + i + "," + j + ") er toppur");
                        counter++;
                        System.out.println("Fjöldi toppa: " + counter);
                        }
                    } 
                }        
            } 
        }
    }                
