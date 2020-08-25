public class Solution {
    public static void main(String args[]) {
        int sumSquares = 0; // 1^2 + 2^2 + ... + 10^2
        int squareSum = 0; // (1 + 2 + ... + 10)^2
        int sum = 0;
        int x = Integer.parseInt( args[0] ) + 1;
        for (int i = 1; i < x; i++) {
            sumSquares += Math.pow(i,2);
            sum += i;
        } squareSum = (int)Math.pow(sum, 2);
        //System.out.println( sumSquares );
        //System.out.println( squareSum );
        System.out.println( squareSum-sumSquares );
    }
}
