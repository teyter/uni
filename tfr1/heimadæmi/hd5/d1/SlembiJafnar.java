public class SlembiJafnar {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int A[] = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = (int)(Math.random()*101);
            while (A[i] % 2 > 0) {
            A[i] = (int)(Math.random()*101);
            }
            if (i < N - 1) {
            System.out.print(A[i] + ", ");
            } else 
                System.out.print(A[i]);
        } System.out.println();
    }
}

