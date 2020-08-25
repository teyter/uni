public class Lausn {
    public static int[][] fylki(int size) {
        int[][] kawai = new int[size][size];
        for (int i = 0, j = 0; i < size; i++) {
            kawai[i][j] = (int)(Math.random()*21)-10;
            System.out.print( kawai[i][j] + " " );
        }
        return kawai;
    }
    public static int gamli(int[][] a) {
        int size = a.length;
        int lsum = 0;
        int rsum = 0;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                if (i == j) lsum += a[i][j];
                if ( (i+j) == (size-1) ) rsum += a[i][j];
                System.out.println( "rsum= " + rsum);
            }
        return Math.abs(lsum - rsum);
    }
    public static void main(String args[]) {
        //int x = Integer.parseInt( args[0] );
        int q[][] = { {1,2,3},
                      {4,5,6},
                      {9,8,9} };
        int result = gamli(q);
        System.out.println( result );
    }
}
