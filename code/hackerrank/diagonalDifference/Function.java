import java.util.*;

public class Function {
    // Complete the compareTriplets function below.
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> score = new ArrayList<Integer>();
        score.add(0);
        score.add(0);
        for (int i = 0; i < a.size(); i++) {
            if ( a.get(i) == b.get(i) );
            else if ( a.get(i) > b.get(i) ) score.set(0, score.get(0)+1);
            else                            score.set(1, score.get(1)+1);
        }
        return score;
    }
    public static int[] arrVersion(int[] a, int[] b) {
        int[] score = { 0, 0 };
        for (int i = 0; i < a.length; i++) {
            if ( a[i] == b[i] );
            else if ( a[i] > b[i] ) score[0]++;
            else                    score[1]++;
        }
        return score;
    }
}
