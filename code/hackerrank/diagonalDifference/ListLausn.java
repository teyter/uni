import java.util.*;

public class ListLausn {
    public static int[][] fylki(int size) {
        int[][] kawai = new int[size][size];
        for (int i = 0, j = 0; i < size; i++) {
            kawai[i][j] = (int)(Math.random()*21)-10;
            System.out.print( kawai[i][j] + " " );
        }
        return kawai;
    }
    public static int gamli(List<List<Integer>> a) {
        int size = a.size();
        int lsum = 0;
        int rsum = 0;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                if (i == j) lsum += a.get(i).get(j);
                if ( (i+j) == (size-1) ) rsum += a.get(i).get(j);
            }
        return Math.abs(lsum - rsum);
    }
    public static void main(String args[]) {
        List<List<Integer>> q = new ArrayList<>();
        q.add(Arrays.asList(1,2,3));
        q.add(Arrays.asList(4,5,6));
        q.add(Arrays.asList(9,8,9));
        int result = gamli(q);
        System.out.println( result );
    }
}
