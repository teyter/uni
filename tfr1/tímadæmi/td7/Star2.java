public class Star2 {
    public static String stjornur(int n) {
        String empty = " ";
        String gaur = "*";
        for (int i = 0; i < n; i++) {
        empty += gaur;
        } return empty;
    } 
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            System.out.println(stjornur(n));
        }
    }


