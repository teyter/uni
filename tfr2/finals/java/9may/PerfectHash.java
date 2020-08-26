public class PerfectHash {
    public static int hashCode(char c, int a, int M) {
        return a*(c-'A')%M;
    }
    public static void main(String[] args) {
        int aa = 0;
        int MM = 0;
        String s = "SEARCHXMPL";
        boolean tokst = true;
        for (int M = 1; M < 100; M++) {
            boolean[] b = new boolean[M];
            for (int a = 1; a <= M; a++) {
                tokst = true;
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (b[hashCode(c,a,M)]) {
                        tokst = false;
                        break;
                    }
                    b[hashCode(c,a,M)] = true;
                }
                if (tokst) {
                    aa = a;
                    MM = M;
                    break;
                }
            }
            if (tokst) break;
        }
        if (tokst) System.out.println("a = " + aa + " og M = " + MM);
    }
}
