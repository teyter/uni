public class Exes {
    public static boolean count(String s) {
        int x = 0;
        int o = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x' || s.charAt(i) == 'X')
                x++;
            if (s.charAt(i) == 'o' || s.charAt(i) == 'O')
                o++;
        } 
        System.out.println( x == o );
        return x == o;
    }
    public static void main(String[] args) {
        count("ooxx");
        count("xooxx");
        count("ooxXm");
        count("zpzpzpp");
        count("zzoo");

    }
}
