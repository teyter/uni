public class split {
    public static char[][] split(char[] s) {
        char[][] a = new char[5][3]; 
        for (int i = 0; i < 3; i++) {
           a[0][i] = s[i]; 
        }
        for (int i = 3; i < 6; i++) {
            a[1][i] = s[i];
        }
        return a;
    }
    public static void main(String[] args) {
        char[] s = {'o', 's', 'h', '\t','6','9',' ','l','e','e','d','s'};
        //char[] split_s = split(s);
        char[][] b = split(s);
        for (int i = 0; i < b.length; i++)
            System.out.print(b[i]);
        System.out.println();
    }
}
