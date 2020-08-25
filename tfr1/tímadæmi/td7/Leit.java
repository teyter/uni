public class Leit {
    public static int finna(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }  return -1;
    }


    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int)(Math.random()*10+1);
            int b = finna(a, 2);
                if (b > -1) {
                StdOut.println("2 er í sæti " + b);
                } else StdOut.println("2 fannst ekki");
        }
    }
}


