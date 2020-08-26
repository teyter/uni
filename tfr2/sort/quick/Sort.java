import edu.princeton.cs.algs4.*;

public class Sort {
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            StdOut.print( array[i] + " " );
        } System.out.println();
    }
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void sort(int[] array) {
        int pivot;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length; i > 0; i++) {
            }
        }
    }
    public static void main(String[] args) {
        int[] oskar = { 2, 6, 5, 3, 8, 7, 1, 0 };
        int n = oskar.length;
        print(oskar);
        swap(oskar,0,oskar.length-1);
        print(oskar);
    }
}
