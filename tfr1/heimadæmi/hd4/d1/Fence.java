public class Fence {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        System.out.print('1');
        for (int i = 2; i <= N; i++) {
            System.out.print("-" + i);
        }
        System.out.println();
    }
}
