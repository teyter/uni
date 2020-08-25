public class AddInts {
    public static void main(String[] args) {
        // how many numbers user will add
        int N = Integer.parseInt(args[0]);
        // initialize the sum variable
        int sum = 0;

        for (int i = 0; i < N; i++) {
            StdOut.print("Enter nr. " + (i+1) + ": ");
            int value = StdIn.readInt();
            sum += value;
        }
        StdOut.println("Sum is " + sum);
    }
}
