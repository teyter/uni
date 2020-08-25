/*
 * boolean rok2 = ((a < b) || (a > b));
 */
public class rok2 {
    public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    boolean rok2 = ((a < b) || (a > b));
    boolean jafngildrok2 = (a != b);
    System.out.println(rok2);
    System.out.println(jafngildrok2);
    }
}

/*
 * Ef a er annað hvort minna en b eða stærra en b
 * þá er a allt nema b.
 */
