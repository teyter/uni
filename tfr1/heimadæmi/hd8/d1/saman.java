public class saman {
    public static boolean saman(int[] a, int d, int e) {
    for (int i = 0; i < a.length; i++) {
       if (a[i] == d && a[i + 1] == e || a[i] == e && a[i + 1] == d) {
          return true;
       }  
    } return false;
}
    public static void main(String[] args) {
        int N = 5;
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*N)+1;
            System.out.print(a[i] + " ");
        } System.out.println();
        int d = 3;
        int e = 4;
        System.out.println(saman(a, d, e));
    }
}
