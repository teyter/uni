public class Nulla {
    public static void nullaUtanHornalinu(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i != j) StdOut.print(0.0 + "\t");
                else StdOut.printf("%.1f\t", a[i][j]);
            } StdOut.println(); StdOut.println();
        }
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double[][] a = new double[N][N];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++)
                a[i][j] = (Math.random()*9.0)+1;
        } nullaUtanHornalinu(a);
    } 
}
