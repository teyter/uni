import edu.princeton.cs.algs4.*;

public class Quick {
    public static void sort(int[] array) {
        int N = array.length;
        D1.swap(array, 3, N-1);
        int itemFromLeft = 0;
        int itemFromRight = N-2;
        for (int i = 0; i < N-1; i++) {

            if (array[itemFromLeft] < array[N-1])
                itemFromLeft++;

            if (array[itemFromRight] > array[N-1])
                itemFromRight--;

            if (array[itemFromLeft] > array[N-1] &&
                array[itemFromRight] < array[N-1])
                D1.swap(array, itemFromLeft, itemFromRight);

            if (itemFromLeft == itemFromRight-1)
                D1.swap(array, itemFromLeft, N-1);

        }
    }
    public static void main(String[] args) {
        int[] array = { 2,6,5,3,8,7,1,0 };
        D1.print(array);
        sort(array);
        D1.print(array);
    }
}
