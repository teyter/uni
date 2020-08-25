public class RecTol {
    public static int TolustafaNr(int tala, int i) {
        if (i == 0) return tala % 10;
         else       return TolustafaNr(tala/10, i - 1); 
    }

    public static void main(String[] args) {
        int tala = Integer.parseInt(args[0]);
        int i = Integer.parseInt(args[1]);

        System.out.println(TolustafaNr(tala, i));
    }
}

