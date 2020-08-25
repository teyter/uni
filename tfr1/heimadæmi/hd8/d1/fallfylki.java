public class fallfylki {
    public static boolean fylki(int[] a) {
        if (a.length == 5) {
            return true;
        } return false;
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); 
        int[] x = new int[N]; 
        for (int i = 0; i < N; i++) {
            System.out.print(x[i] + " ");
        } System.out.println();
        System.out.println(fylki(x));
    }
}
