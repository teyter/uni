import java.util.Arrays;

public class Pairs {
    private static int findPairs(int[] a) {
        Arrays.sort(a);
        int count = 0;
        int occ = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i-1])
                occ++;
            else
                if (occ > 1) {
                    count += (occ-1) * occ / 2;
                    occ = 1;
                }
        }
        if (occ > 1)
            count += (occ-1) * occ / 2;
        return count;
    }
}
