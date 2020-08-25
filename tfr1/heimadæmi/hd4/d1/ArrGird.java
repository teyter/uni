public class ArrGird {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
//        System.out.print('!');
        String fence = "-----!";

        for (int i = 0; i < N; i++) {
            if (i==0) {
            System.out.print("!");
            } else System.out.print(fence);
        }System.out.println();
    }
}

