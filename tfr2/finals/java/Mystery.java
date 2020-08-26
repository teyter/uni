public class Mystery {
    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }
    public static void main(String[] args) {
        String baller = "nosradnumðuG rutieT";
        String result = mystery(baller);
        System.out.println(result);
    }
}
