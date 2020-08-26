
public class BokExample {
    public static void sort(Integer[] a) { 
        int N = a.length;
        for (int i = 0; i < N; i++) { 
            int min = i;
            for (int j = i+1; j < N; j++)
            if (less(a[j], a[min])) min = j;
                exch(a, i, i-1);
        }
    }

    private static void exch(Integer[] a, int i, int j) { 
        Integer temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    private static boolean less(Integer v, Integer w) {
        return v.compareTo(w) < 0;
    }
}
