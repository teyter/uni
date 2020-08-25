public class Vinningur {
    public static void main(String[] args) { 
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // Make sure numbers are only between 1 and 5
        if (a < 1 || a > 5 || b < 1 || b > 5 || c < 1 || c > 5) {
            System.out.println("Only numbers between 1 and 5");
        } // 10 points if all numbers are 5
        if (a == 5 && b == 5 && c == 5) {
            System.out.println("10 stig");
        } // 5 points if all numbers are they same < 5
        else if (a == b && a == c) {
            System.out.println("5 stig");
        } // 2 points of two numbers are the same
        else if (a == b || b == c || a == c) {
            System.out.println("2 stig");
        } // 0 points otherwise / if no numbers are the same
        else 
            System.out.println("0 stig");
    }
}

