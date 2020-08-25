import java.util.*;
import edu.princeton.cs.algs4.*;

public class Solution {
    public static int left(int[][] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum += a[i][i];
        return sum;
    }
    public static int leftright(int[][] a) {
        int left = a[0][0] + a[1][1] + a[2][2];
        int right = a[0][2] + a[1][1] + a[2][0];
        return Math.abs(left - right);
    }
    public static int real(List<List<Integer>> arr) {
        int left = arr.get(0).get(0) + arr.get(1).get(1) + arr.get(2).get(2);
        int right = arr.get(0).get(2) + arr.get(1).get(1) + arr.get(2).get(0);
        return Math.abs(left - right);
    }
    public static void main(String[] args) {
        int[][] x = { {1,2,3},
                      {4,5,6},
                      {9,8,9} };
        List<List<Integer>> bla = new ArrayList<>();
        bla.add(Arrays.asList(1, 2, 3));
        bla.add(Arrays.asList(4, 5, 6));
        bla.add(Arrays.asList(9, 8, 9));
        // teiturteiturteiturteitur
        int result = real(bla);
        StdOut.println( result );
        int bes = leftright(x);
        StdOut.println( bes );
    }
}
