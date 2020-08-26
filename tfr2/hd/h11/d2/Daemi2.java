import edu.princeton.cs.algs4.*;
import java.util.HashSet;
import java.util.Set;

public class Daemi2 {

    public static int[] reykjaHash() {
        int[] gildi = new int[2];

        int[] bokstf = {19, 5, 1, 18, 3, 8, 24, 13, 16, 12};

        for(int m = 2; m <= 100; m++) {
            for(int a = 1; a <= 1000; a++) {
                Set<Integer> hashes = new HashSet<>();

                for(int i = 0; i < bokstf.length; i++) {
                    int hash = (a * k) % m;
                    hashes.add(hash);
                }

                if (hashes.size() == 10) {
                    gildi[0] = a;
                    gildi[1] = m;
                    return gildi;
                }
            }
        }
        return null;
    }
}
