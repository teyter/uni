import java.util.Arrays;

public class Autism {
    public static void main(String[] args) {
        int[] a = {2,1,4,3,6,5,8,7,9,0};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
