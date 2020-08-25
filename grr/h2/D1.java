import edu.princeton.cs.algs4.*;

public class D1 {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            StdOut.print( array[i] + " " );
        } System.out.println();
    }
    public static void QuickSort(int[] a) {
        int n = a.length;
        int pivot = 0;
        if (n > 1) {
            // velja midju stakid sem pivot
            if (a.length % 2 == 0) pivot = a.length/2;
            else pivot = (a.length/2)-1;
        }
            int r = Partition(a, pivot);
    }
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int Partition(int[] A, int p) {
        int n = A.length;
        swap(A, p, n-1);
        int l = -1;
        for (int i = 0; i < n-2; i++) {
            if (A[i] < A[n-1]) {
                l++;
                swap(A, l, i);
            }
        }
        swap(A, n-1, l+1);
        return l+1;
    }
    public static void main(String[] args) {
        int[] oskar = { 2, 6, 5, 3, 8, 7, 1, 0 };
        int[] strad = { 2, 2, 2, 2, 2, 2, 2, 2 };
        int k = Partition(oskar, 2);
        print(oskar);
        StdOut.printf("%d\n", k);
    }
}
