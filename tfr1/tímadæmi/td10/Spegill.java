public class Spegill {
    public static boolean palin(int[] a) {
        int N = a.length;
        for (int i = 0; i < N/2; i++) {
           if (a[i] != a[a.length - 1 - i]) {
                return false;
           } 
        } return true;
    }
    public static void main(String[] args) {
       int[] sarah = { 1, 2, 3, 2, 1 };
       int[] michael = { 1, 2, 3, 4, 5 };
       System.out.println(palin(sarah));
       System.out.println(palin(michael)); 
    }
}
