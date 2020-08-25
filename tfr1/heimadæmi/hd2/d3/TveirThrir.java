public class TveirThrir {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        boolean abool = (a % 3 == 0);
        boolean bbool = (b % 3 == 0);
        boolean cbool = (c % 3 == 0);

        if (abool && bbool || abool && cbool || bbool && cbool) {
            System.out.println(true);
        }
        else { System.out.println(false); }
    }
}
