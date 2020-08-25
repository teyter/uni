public class Jola {
    public static void main(String[] args) {
        String s = "Jólasveinn";
        String t = s.substring(4, 7).concat(s.substring(2, 4));
        StdOut.println(t);
    }
}
