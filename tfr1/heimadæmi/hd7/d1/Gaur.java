public class Gaur {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Math.abs(a) + Math.abs(b) + 1;
        int d = Math.abs(a) - Math.abs(b) + 1;
        int range = 0;

        for (int i = 0; i < 30; i++) {
        if (a < 0 && b > 0) {
            range = (int)(Math.random()*c)-Math.abs(b);
            System.out.print(range + " ");
        }
        else if (a < 0 && b < 0) {
            range = (int)(Math.random()*d)-Math.abs(a);
            System.out.print(range + " ");
        }
        } System.out.println();
    }
}

