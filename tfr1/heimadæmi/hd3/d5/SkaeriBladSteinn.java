public class SkaeriBladSteinn {
    public static void main(String[] args) {
        char L1 = args[0].charAt(0);
        char L2 = args[1].charAt(0);

        if (L1 == 's' && L2 == 's' || L1 == 'b' && L2 == 'b' || L1 == 't' && L2 == 't') {
            System.out.println("Jafnt");
        } else if (L1 == 's' && L2 == 'b' || L1 == 'b' && L2 == 't' || L1 == 't' && L2 == 's') {
            System.out.println("Leikmadur 1");
        } else if (L2 == 's' && L1 == 'b' || L2 == 'b' && L1 == 't' || L2 == 't' && L1 == 's') {
            System.out.println("Leikmadur 2");
        }
    }
}
