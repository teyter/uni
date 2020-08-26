public class ThreeSum {
    public static void main(String[] args) {
        int cnt = 0;
        int N = 100;
        int a[] = new int[N];
        for (int p = 0; p < N; p++)
            a[p] = (int)(Math.random()*11);
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                for (int k = 0; k < N; k++)
                    if (i < j && j < k)
                        if (a[i] + a[j] + a[k] == 0)
                            cnt++;
        System.out.println(cnt);
    }
}
