public class RammiNM {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                if ((i == 0 || i == N) && (j == 0 || j == M)) {
                    System.out.print("+"); 
                }
                else System.out.print("-");
            }
            System.out.println();
        }
    }
}
