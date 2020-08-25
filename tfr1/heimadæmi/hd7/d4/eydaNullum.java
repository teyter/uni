public class eydaNullum {
    public static int[] eydaNullum(int[] a) {

        int N = 20;
        int count = 0;

        for (int i = 0; i < N; i++) {
            if (a[i] > 0) {
                count++;
            }
        }
        int[] b = new int[count];
        int var = 0; 

        for (int i = 0; i < N; i++) {
            if (a[i] > 0) {
                b[var] = a[i];
                var++;
            }
        }
        return b;
    }
    public static void main(String[] args) {

        int[] a = new int[20];

        for (int i = 0; i < 20; i++) {
            a[i] = (int)(Math.random()*6);
        }

        int[] b = eydaNullum(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        } System.out.println();
    }
}
