public class Endurk {
    public static int endurk(int n) {
        if (n <= 0) return 1;
        else return n * endurk(n-1);
    }
    public static void main(String[] args) {
       int N = Integer.parseInt(args[0]);
       System.out.println(endurk(N)); 
    }
}

/*
 *==========================================*
 Til að laga forritið, breyti ég return 0 í
 return 1. Annars margfaldar fallið alltaf
 með núll, og skilar því alltaf 0. 
 *==========================================*
 */
