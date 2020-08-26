public class Triplicates {
    public static String Trip(String[] s, String[] t, String[] r) {
        int x = -1;
        int y = -1;
        for (int i = 0; i < s.length; i++)
            for (int j = 0; j < s.length; j++) {
                if (x == 0 || y == 0) return s[i];
                x = s[i].compareTo(t[j]);
                y = s[i].compareTo(r[j]);
            }
        return "No match";
    }
    public static void main(String[] args) {
        String[] s = {"Jon","Peter","Lucas"};
        String[] t = {"Will","Gouda,","Dick"};
        String[] r = {"Phil", "String", "Jon"};
        System.out.println(Trip(s,t,r));
    }
}
