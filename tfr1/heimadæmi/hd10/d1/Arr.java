public class Arr {
    public static void Fleng(int[][] a) {
        return;
    }
    public static void main(String[] args) {
       int[][] a = {{ 1, 1, 1, 1 },
                    { 2, 2, 2, 2 },
                    { 3, 3, 3, 3 },
                    { 4, 4, 4, 4 } };
        /*for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = (int)(Math.random()*11);
            }
        }*/
        StdArrayIO.print(a);
        System.out.println(a[0][0]);
        System.out.println(a[1][1]);
        System.out.println(a[2][2]);
        System.out.println(a[3][3]);
    }
}
