public class ProfF {
    public static void main(String[] args) {

        int a = 3; 
        int b = 7;

        while (a < b) {
            if (a++ % 2 == 0) b--;
        }
        StdOut.println("a = " + a + "\nb = " + b);
    }
}
