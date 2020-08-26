import java.util.Arrays;

public class inPairs {
    public static void main(String[] args) {
        int l = args.length;
        int[] N = new int[l];
        for (int i = 0; i < l; i++) 
            N[i] = Integer.parseInt(args[i]);
        Arrays.sort(N);
        int eins = 1;
        int pairs = 0;
        for (int i = 0; i < l-1; i++) {
            if (N[i] == N[i+1]) eins++;
            else {
                pairs += ((eins-1)*eins)/2;
                eins = 1;
            }
        }
        pairs += ((eins-1)*eins)/2;
        System.out.println("Fjoldi: " + pairs);
    }
}
