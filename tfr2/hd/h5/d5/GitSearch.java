package chapter1.section4;
import edu.princeton.cs.algs4.StdOut;

public class Exercise10 {
    private static int binarySearchIterative(int[] array, int key, int low, int high) {
        while (low < high) {
            int middle = low + (high - low) / 2;
            if (array[middle] < key) {
                low = middle + 1;
            } else if (array[middle] > key) {
                high = middle - 1;
            } else if (middle > 0 && array[middle - 1] == key) {
                high = middle;
            } else {
                return middle;
            }
        }

        return -1;
    }
}
