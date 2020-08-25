// Endurkvaemt fall sem skilar
// 1+2+...+N
// Thetta skilar tolunni N(N+1)/2
public class Rec0 {
    public static int son(int N) {
        if (N == 0) return 0;
        else        return N + son(N-1);
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        StdOut.println(son(N));
    }
}

