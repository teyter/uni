public class rok1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean rok1 = ( !(a >= b) );
        boolean jafngildrok1 = (a < b);
        System.out.println(rok1);
        System.out.println(jafngildrok1);
    } 
}
/*
 * a er ekki meira en b og ekki jafnt og b
 * a er því minna en b
 */
