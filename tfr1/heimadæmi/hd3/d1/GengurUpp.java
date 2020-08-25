public class GengurUpp {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        if (a % b == 0 || b % a == 0) {
            System.out.println("Gengur upp.");
        } else System.out.println("Gengur ekki upp.");
    }
}
