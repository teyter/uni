public class Ferningar {
    public static boolean isSquare(int a) {
        boolean check;

        double nr = a;
        double result = Math.sqrt(nr);
        int sub = (int)(Math.sqrt(nr));

        if ((result - sub) == 0) {
            check = true;
        } else {
            check = false;
        } return check;
    }
    public static void main(String[] args) {
        int number = 10 + (int)(Math.random()*10);
        int count = 0;
        while (number > 0) {
            if (count % 2 == 0) {
                StdOut.print("Tala: ");
                StdOut.println(number);
                StdOut.println("Leikmadur 1: ");
            } else {
                StdOut.print("Tala: ");
                StdOut.println(number);
                StdOut.println("Leikmadur 2: ");
            }
            int a = StdIn.readInt();
            if (isSquare(a)) {
                number -= a;
                count++;
            } else {
                StdOut.println("Einungis ferningstolur");
            }
        }
        int winner = 1;
        if (count % 2 == 0) {
            winner++;
        }
        StdOut.print("Leikmadur " + winner + " hefur sigrad");
        System.out.println();
    }
}

