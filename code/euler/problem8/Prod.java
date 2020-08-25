public class Prod {
    public static int flop(char x) {
        return Integer.valueOf( String.valueOf(x) );
    }
    public static long max(String number) {
        long max = 0;
        for (int i = 0; i < number.length() - 13; i++) {
            int one = flop( number.charAt(i) );
            int two = flop( number.charAt(i+1) );
            int three = flop( number.charAt(i+2) );
            int four = flop( number.charAt(i+3) );
            int five = flop( number.charAt(i+4) );
            int six = flop( number.charAt(i+5) );
            int seven = flop( number.charAt(i+6) );
            int eight = flop( number.charAt(i+7) );
            int nine = flop( number.charAt(i+8) );
            int ten = flop( number.charAt(i+9) );
            int eleven = flop( number.charAt(i+10) );
            int twelve = flop( number.charAt(i+11) );
            int thirteen = flop( number.charAt(i+12) );
            long product = one*two*three*four*five*six*seven*eight*nine*ten*eleven*twelve*thirteen;
            if (product == 23514624000)
                System.out.println("Þú klúðraðir að finna max, hálfviti");
            if ( max < product )
                max = product;
        }
        return max;
    }

    public static void main(String[] args) {
        String number = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
        long result = max(number);
        System.out.println( result );
    }
}
