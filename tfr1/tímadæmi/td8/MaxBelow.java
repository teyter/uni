public class MaxBelow {
    public static boolean getMaxBelow(int a, 
            int b, int max) {
        if (b > max && b < a) {
            return true;
        } else return false;
    }
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);        
        int max = Integer.MIN_VALUE;
        while (!StdIn.isEmpty()) {
            int b = StdIn.readInt();
            if(getMaxBelow(a,b,max)) {
                max = b;
            }
        }
        StdOut.println("Hæsta talan sem er 
                minni en " + a + " er " + max);
    }
}

