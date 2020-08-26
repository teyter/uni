import edu.princeton.cs.algs4.*;

public class BinarySearch {
    public static int[] makeArray(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = (int)(Math.random()*1000);
        return arr;
    }
    public static int[] lesser(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n/2];
        for (int i = 0; i < n/2; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
    public static int[] greater(int[] arr) {
        int n = arr.length;
        int[] newArr;
        if (n % 2 == 0)
            newArr = new int[n/2];
        else 
            newArr = new int[(n/2)+1];
        int j = 0;
        for (int i = (n/2); i < n; i++) {
            newArr[j] = arr[i];
            j++;
        }
        return newArr;
    }
    public static boolean search(int[] arr, int find) {
        int n = arr.length;
        if (n == 2) {
            if (arr[0] == find || arr[1] == find) return true;
            else return false;
        }
        //StdOut.println("Is it " + arr[n/2] + "?");
        if (find == arr[n/2]) {
            StdOut.println("Found " + arr[n/2]);
            return true;
        }
        if (find < arr[n/2]) {
            int[] newArr = lesser(arr);
            return search(newArr, find);
        }
        if (find > arr[n/2]) {
            int[] newArr = greater(arr);
            return search(newArr, find);
        }
        return false;
    }
    public static void test() {
        int X = 100000;
        int[] myArray = makeArray(X);
        int randomStak = (int)(Math.random()*X);
        int toFind = myArray[randomStak];
        toFind = myArray[myArray.length-2];
        Bubble.sort(myArray);
        //StdOut.println("Find: " + toFind);
        search(myArray, toFind);
    }
    public static void test2() {
        int[] blarray = sortedArray(100000000);
        StdOut.println( search(blarray, 99998) );
    }
    public static int[] sortedArray(int N) {
        int[] newArr = new int[N];
        for (int i = 0; i < N; i++) {
            newArr[i] = i;
        }
        return newArr;
    }
    public static void main(String[] args) {
        test2();
    }
}
