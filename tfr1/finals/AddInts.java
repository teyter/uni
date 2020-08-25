public class AddInts {
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;

        StdOut.print("Enter nr. " + i + ": ");

        while (!StdIn.isEmpty()) {

            StdOut.print("Enter nr. " + (i+1) + ": ");
            int value = StdIn.readInt();
            sum += value;
            i++;

        } StdOut.println();
        StdOut.println("Sum is: " + sum);
    }
}
