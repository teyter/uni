public class BoolFall {
    public static boolean oddatala(int i) {
        if (i % 2 == 0) return true;
        else return false;
        StdOut.println("I will not print");
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        StdOut.println(oddatala(N));
    }
}

