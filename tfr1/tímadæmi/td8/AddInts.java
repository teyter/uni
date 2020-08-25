public class AddInts {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]); 
        int sum = 0;
        while(!StdIn.isEmpty()) {
            int value = StdIn.readInt();
            sum += value + a;
        }
        StdOut.println("Sum is: " + sum);
    }
}

