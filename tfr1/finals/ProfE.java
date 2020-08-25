public class ProfE {
    public static void main(String[] args) {

        int i = 0;
        int k = 2;

        if (i > 0 && k/i > 1.0)
            k++;
        else if (k*i <= 0)
            k *= k;
        else
            k--;

        StdOut.println(k);
    }
}
