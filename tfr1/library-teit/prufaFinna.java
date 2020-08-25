public class prufaFinna {
    public static void main(String[] args) {
        int [] a = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = (int)(Math.random()*101);
            System.out.print(a[i] + " ");
        } System.out.println();
        int b = Finna.max(a);
        int c = Finna.min(a);
        System.out.println("Max : " + b);
        System.out.println("Min : " + c);
    }
}

