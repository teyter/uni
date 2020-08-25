public class Tafla {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        for (int i = 1; i <= N; i++) {
           for (int j = N; j >= i; j--) {
               System.out.print(i + " ");
           } System.out.println();
        }
    }
}


