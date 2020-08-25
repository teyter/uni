public class RammiNM {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        
        if (N < 2 || M < 2) {
            System.out.println("Bara 2 eða stærri, takk");
        } else {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (i == 1 || i == N) {
                    if (j == 1 || j == M) {
                        System.out.print("+");
                    } else { 
                        System.out.print("-"); 
                    }
                } else { 
                    if (j == 1 || j == M) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                        }
                    }
                } System.out.println();
            }
        } 
    }
}

