public class hop2 {
    public static int innerSum(int[][] x) {
        int prod = 1;
        int sum = 0;
        int ii = x.length;
        for (int i = 0; i < ii; i++)  {
            int jj = x[i].length;
            for (int j = 0; j < jj; j++) {
                prod *= x[i][j];
            }
            sum += prod;
            prod = 1;
        } 
        return sum;
    }
    public static void main(String[] args) {
        int[][] a = {
            {1,2,1},            // 0
            {3,4,7},            // 1
            {5,6,99},           // 2
            {1,9,9},            // 3
            {1,2},
            {1,2,2},
            {1,2,3,4,5},
            {1,2,2,2,2,2,2}     // 4
        };
        int res = innerSum(a);
        System.out.println( res );
    }
}
