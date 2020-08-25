public class HlidaTilVinstriUmEinn {
    public static void main(String[] args) {
        String swap = "";
        // hlidra stokum i args
        for (int i = 0; i < args.length-1; i++) {
            swap = args[i+1];
            args[i+1]  = args[i];
            args[i] = swap;
        }
        // prenta args eftir hlidrun
        for (int i = 0; i < args.length; i++) {
            System.out.print( args[i] + " " );
        } System.out.println();
    }
}
