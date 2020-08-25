/*********************************************************** 
 * Multiples of 3 and 5 
 *
 * If we list all the natural numbers below 10 that are
 * multiples of 3 and 5, we get 3, 5, 6 and 9.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
***********************************************************/
public class ThreeFive {
    public static boolean isMult(int x) {
        if (x % 3 == 0 || x % 5 == 0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (isMult(i))
                sum += i;
        }
        System.out.println(sum);
    }
}
