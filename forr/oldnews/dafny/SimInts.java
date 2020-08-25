public class SimInts {
    public static int SumInts(int k) {
        System.out.print(k +  " ");
        if (k == 0) return 0;
        else        return SumInts(k-1)+k;
    }
    public static void main(String[] args) {
        int x = Integer.parseInt( args[0] );
        SumInts(x);
        System.out.println();
    }
}
