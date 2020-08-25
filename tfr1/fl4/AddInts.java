public class AddInts {
    public static void main(String[] args) {
	int sum = 0;
        int nr = 1;

	while (!StdIn.isEmpty()) {
	    StdOut.print("Enter nr. " + (nr) + ": ");
		int value = StdIn.readInt();
		sum += value;
                nr++;
	}
	StdOut.println("Sum is " + sum);
    }
} 
