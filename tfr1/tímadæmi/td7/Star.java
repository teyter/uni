public class Star {
    public static String stjornur(int n) {
        String empty = " ";
        String gaur = "*";
        for (int i = 0; i < n; i++) {
            System.out.print(gaur + empty);
        } System.out.println(); 
        return gaur;
    } 
        public static void main(String[] args) {
            int n = Integer.parseInt(args[0]);
            stjornur(n);
        }
    }


