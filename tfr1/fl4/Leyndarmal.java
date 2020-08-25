public class Leyndarmal {
    public static int fall(int i) {
        i++;
        return i;
    }
    public static void main(String[] args) {
        int i = 4;
        int j = fall(i);
        StdOut.println(i + ", " + j);
    }
}

