public class slembi1024 {
    public static int slembi1024(int r) {
        return r = (22 * r + 5) % 1024;
    }
    public static void main(String[] args) {
        int r = 0;
        for (int i = 0; i < 10; i++) {
            r = slembi1024(r);
            System.out.print(slembi1024(r)+" ");
        } System.out.println();
    }
}
