public class NaerTugur {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        if (n % 10 == 0 ) {
            System.out.println("Er tugur.");
        } else if (n % 10 == 1 || n % 10 == 9) {
            System.out.println("Nálægt tug.");
        } else System.out.println("Ekki nálægt tug.");
    }
}
