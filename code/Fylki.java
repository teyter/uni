public class Fylki {
    public static void main(String[] args) {
        int[] fylki = new int[args.length];

        int swap = 0;
        // setja args inni nytt fylki
        for (int i = 0; i < fylki.length; i++) {
            fylki[i] = Integer.parseInt( args[i] );
        }
        // hlidra stokum i fylki
        for (int i = 0; i < fylki.length-1; i++) {
            swap = fylki[i+1];
            fylki[i+1] = fylki[i];
            fylki[i] = swap;
        }
        // prenta fylki eftir hlidrun
        for (int i = 0; i < fylki.length; i++) {
            System.out.print( fylki[i] + " ");
        } System.out.println();
    }
}
