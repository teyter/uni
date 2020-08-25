public class slembi {
    public static int slembi(int r) {
           return r = (4 * r + 1) % 9;
    }
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        for (int i = 0; i < 10; i++) {
            r = slembi(r);
            System.out.print(slembi(r)+" ");
        } System.out.println();
    }
}
