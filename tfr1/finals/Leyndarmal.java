public class Leyndarmal {
    public static int fall(int x) {
        x++;
        return x;
    }
    public static void main(String[] args) {
        int i = 4;
        int j = fall(i);
        StdOut.println(i + ", " + j);
        // 4, 5 
    }
}
