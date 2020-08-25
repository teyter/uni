public class Girding {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.print('!');
        String fence = "-----!";

        for (int i = 0; i < N; i++) {
            System.out.print(fence);
        }System.out.println();
    }
}

