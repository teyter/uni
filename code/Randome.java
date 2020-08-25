public class Randome {
    public static void main(String[] args) {
        int N = 0;
        for (int i = 0; i < 30; i++) {
            N = (int)(Math.random()*10)+20;
            System.out.print( N + " " );
        } System.out.println();
        for (int i = 0; i < N; i++) {
        }
    }
}
