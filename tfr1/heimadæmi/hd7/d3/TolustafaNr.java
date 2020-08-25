public class TolustafaNr {
    public static int TolustafaNr(int tala, int i) {
        int a = i;
        int nr = tala;
        while (a > 0) {
            nr = nr / 10;
            a -= 1;
        }
        return nr % 10;
    }

    public static void main(String[] args) {
        int tala = Integer.parseInt(args[0]);
        int i = Integer.parseInt(args[1]);

        int result = TolustafaNr(tala, i);
        System.out.println(result);
    }
}

