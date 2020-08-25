public class HMedaltal3 {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            int a[] = StdIn.readAllInts();
            if (a.length < 3) 
                StdOut.println("At least three");
            else {
                for (int i=0; i < a.length-2; i++) {
                    int b = a[i+2] + a[i+1] + a[i];
                    double c = b/3.0;
                    StdOut.println("Avg: " + c);
                }
            }
        }
    }
}
