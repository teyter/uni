public class Euler {
    public static void main(String[] args) {
        int K = Integer.parseInt( args[0] );
        int t = Integer.parseInt( args[1] );
        double v = 0.04;
        double tv = t*v;
        double evt = Math.exp(tv); 
        System.out.println( K*evt ); 
        System.out.println("Eftir 1 ár áttu " + K*evt + " kr ef vextirnir eru 4.0%");
    }
}
