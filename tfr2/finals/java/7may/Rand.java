public class Rand {
    public static int[] array(int N) {
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = (int)(Math.random()*101);
        } return a;
    }
}
