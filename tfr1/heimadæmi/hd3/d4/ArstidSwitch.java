public class ArstidSwitch {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        switch (month) {
            case 12: case 1: case 2:
               System.out.println("Vetur"); break;
            case 3: case 4: case 5:
               System.out.println("Vor"); break;
            case 6: case 7: case 8:
               System.out.println("Sumar"); break;
            case 9: case 10: case 11:
               System.out.println("Haust"); break;
            default:
               System.out.println("Ekkert svona"); break;
        }
    }
}
